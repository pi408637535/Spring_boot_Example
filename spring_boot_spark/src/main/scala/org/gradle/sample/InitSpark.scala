package org.gradle.sample

import org.apache.log4j.{Level, LogManager, Logger}
import org.apache.spark.sql.SparkSession

trait InitSpark {
  val spark: SparkSession = SparkSession.builder()
                            .appName("Spark example")
                            .master("local[*]")
                            .getOrCreate()

  val sc = spark.sparkContext
  sc.hadoopConfiguration.set("fs.hdfs.impl", classOf[org.apache.hadoop.hdfs.DistributedFileSystem].getName)
  sc.hadoopConfiguration.set("fs.file.impl", classOf[org.apache.hadoop.fs.LocalFileSystem].getName)


  val sqlContext = spark.sqlContext

  def reader = spark.read
               .option("header",true)
               .option("inferSchema", true)
               .option("mode", "DROPMALFORMED")

  def readerWithoutHeader = spark.read
                            .option("header",true)
                            .option("inferSchema", true)
                            .option("mode", "DROPMALFORMED")
  private def init = {
    sc.setLogLevel("ERROR")
    Logger.getLogger("org").setLevel(Level.ERROR)
    Logger.getLogger("akka").setLevel(Level.ERROR)
    LogManager.getRootLogger.setLevel(Level.ERROR)
  }

  init

  def close = {
    spark.stop()
  }
}
