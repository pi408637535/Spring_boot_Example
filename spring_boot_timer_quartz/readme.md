运行:
    127.0.0.1:8080/home/save
    {
    	"jobName":"com.lance.quartz.common.job.MinuteJob",
    	"jobGroup":"one",
    	"jobDescription":"this is my test ",
    	"cronExpression":"0 0/1 * * * ?"
    }
    正确的返回
    {
      "errorCode": 0,
      "errorText": ""
    }


