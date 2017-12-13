package org.gradle.sample

import org.ansj.domain.Term
import org.ansj.splitWord.analysis.ToAnalysis
import org.apache.spark.mllib.classification.{NaiveBayes, NaiveBayesModel}
import org.apache.spark.mllib.feature.{HashingTF, IDF}
import org.apache.spark.mllib.recommendation.{ALS, MatrixFactorizationModel, Rating}
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.Dataset


object MovieRatings extends InitSpark {

	var naiveModelNaive:NaiveBayesModel = _
	var hashingTfGlobal:HashingTF = _

	def CalculateAverageRating() = {
		import spark.implicits._

		val version = spark.version
		println("SPARK VERSION = " + version)

		//val sumHundred = spark.range(1, 101).reduce(_ + _)
		//println(f"Sum 1 to 100 = $sumHundred")

		//val sourceFile = "hdfs://sandbox.hortonworks.com:8020/user/maria_dev/ratings.csv"
		//val sourceFile = "ratings.csv"
		val sourceFile = "/Users/jason/Downloads/ml-latest-small/ratings.csv"

		println("Reading from csv file: " + sourceFile)
		//val ratings: Dataset[Rating] = reader.csv(sourceFile).as[Rating]

		val rawRatings: Dataset[RawRatingData] = reader.format("com.databricks.spark.csv").load(sourceFile).cache().as[RawRatingData]
		rawRatings.show(10)

		val averageRating = rawRatings.groupBy("movieId").avg("rating")
		averageRating.show(10)
		val counts = rawRatings.groupBy("movieId").count()
		counts.show(10)
		val averagesAndCount = counts.join(averageRating, "movieId")
		averagesAndCount.show(10)


		val topTen = averagesAndCount.orderBy("avg(rating)").show(10)

		val ratings: RDD[Rating] = rawRatings.map((rrd: RawRatingData) => Rating(rrd.userId, rrd.movieId, rrd.rating)).rdd

		// Build the recommendation model using ALS
		val rank = 10
		val numIterations = 10
		val model = ALS.train(ratings, rank, numIterations, 0.01)

		//naiveModelNaive = model
		//    persons.show(2)
		//    val averageAge = persons.agg(avg("age"))
		//                     .first.get(0).asInstanceOf[Double]
		//    println(f"Average Age: $averageAge%.2f")

		close
	}

	def runPi(): Unit = {
		val df = spark.read.json("src/main/resources/people.json")
		// Displays the content of the DataFrame to stdout
		df.show()
		// +----+-------+
		// | age|   name|
		// +----+-------+
		// |null|Michael|
		// |  30|   Andy|
		// |  19| Justin|
		// +----+-------+
		// $example off:create_df$
		import spark.implicits._

		// $example on:untyped_ops$
		// This import is needed to use the $-notation
		// Print the schema in a tree format
		df.printSchema()
		// root
		// |-- age: long (nullable = true)
		// |-- name: string (nullable = true)

		// Select only the "name" column
		df.select("name").show()
		// +-------+
		// |   name|
		// +-------+
		// |Michael|
		// |   Andy|
		// | Justin|
		// +-------+

		// Select everybody, but increment the age by 1
		df.select($"name", $"age" + 1).show()
		// +-------+---------+
		// |   name|(age + 1)|
		// +-------+---------+
		// |Michael|     null|
		// |   Andy|       31|
		// | Justin|       20|
		// +-------+---------+

		// Select people older than 21
		df.filter($"age" > 21).show()
		// +---+----+
		// |age|name|
		// +---+----+
		// | 30|Andy|
		// +---+----+

		// Count people by age
		df.groupBy("age").count().show()
		// +----+-----+
		// | age|count|
		// +----+-----+
		// |  19|    1|
		// |null|    1|
		// |  30|    1|
		// +----+-----+
		// $example off:untyped_ops$

		// $example on:run_sql$
		// Register the DataFrame as a SQL temporary view
		//    df.createOrReplaceTempView("people")
		//
		//    val sqlDF = spark.sql("SELECT * FROM people")
		//    sqlDF.show()
		//    // +----+-------+
		//    // | age|   name|
		//    // +----+-------+
		//    // |null|Michael|
		//    // |  30|   Andy|
		//    // |  19| Justin|
		//    // +----+-------+
		//    // $example off:run_sql$
		//
		//    // $example on:global_temp_view$
		//    // Register the DataFrame as a global temporary view
		//    df.createGlobalTempView("people")
		//
		//    // Global temporary view is tied to a system preserved database `global_temp`
		//    spark.sql("SELECT * FROM global_temp.people").show()
		//    // +----+-------+
		//    // | age|   name|
		//    // +----+-------+
		//    // |null|Michael|
		//    // |  30|   Andy|
		//    // |  19| Justin|
		//    // +----+-------+
		//
		//    // Global temporary view is cross-session
		//    spark.newSession().sql("SELECT * FROM global_temp.people").show()


	}

	def runSql(): Unit = {
		spark.sql("use database")
		spark.sql("select * from tablename").show(10)
	}

	def splitWordToSeq(news: String) = {
		val terms: java.util.List[Term] = ToAnalysis.parse(news).getTerms
		val size = terms.size()
		var res = ""
		for (i <- 0 until size) {
			res += terms.get(i.toInt).getName + " "
		}
		res.split(" ")
	}

	def runNaiveBayesClassify(): Unit = {
		import spark.implicits._
		val src = sc.textFile("hdfs://192.168.152.138:9000/ml/text/span_forum2.txt").map(x => x.split("==").toSeq)
		val trainRdd = src
		  .map(
			  x => {
				  (x(0).toDouble, splitWordToSeq(x(1)))
			  }
		  )
		//tf-idf
		val hashingTF = new HashingTF(Math.pow(2, 18).toInt)
		hashingTfGlobal = hashingTF
		//计算TF
		val newSTF = trainRdd.map {
			case (num, seq) =>
				val tf = hashingTF.transform(seq)
				(num, tf)
		}

		val idfs = new IDF().fit(newSTF.values)
		val newsIDF = newSTF.mapValues(v => idfs.transform(v))

		val dataRdd = newsIDF.map(ele => {
			LabeledPoint(ele._1, ele._2)
		})

		val Array(training, test) = dataRdd.randomSplit(Array(0.8, 0.2))
		val model = NaiveBayes.train(training, lambda = 1.0, modelType = "multinomial")
	//	model.save(sc, "/wode/ml/model")

		naiveModelNaive = model
		val predictionAndLabel = test.map(p => (model.predict(p.features), p.label))
		val accuracy = 1.0 * predictionAndLabel.filter(x => x._1 == x._2).count() / test.count()
		println(accuracy)
	}

	def runClassify(text:String): Double = {

		val stringData = text
		val data = splitWordToSeq(stringData)
		
		val tfs = hashingTfGlobal.transform(data)
		val rddVector = sc.parallelize(Seq(tfs))
		val idf = new IDF().fit(rddVector)

		val tf_idf= idf.transform(tfs)
		naiveModelNaive.predict(tf_idf)
	}
}
