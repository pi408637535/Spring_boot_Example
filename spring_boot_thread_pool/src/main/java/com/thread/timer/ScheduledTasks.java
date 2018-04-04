package com.thread.timer;

import com.thread.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by piguanghua on 3/23/18.
 */
@Component
@Configurable
@EnableScheduling //@EnableScheduling：标注启动定时任务。
public class ScheduledTasks {

    @Autowired
    private AsyncTask asyncTask;


    @Scheduled(cron = "0 0/1 *  * * * ")
    public void reportCurrentByCron() throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            asyncTask.doTask1(i,"通知：为了给大家营造良好的学习，建立一个免费交流学习q 裙【70896】验证00名额有限，速速加入，裙内每天推荐强势个股、分析个股");
        }
    }


}
