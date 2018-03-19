package component;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by piguanghua on 2016/12/17.
 */
@Component
@Configurable
@EnableScheduling //@EnableScheduling：标注启动定时任务。
public class ScheduledTasks {

   /* @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
        System.out.println ("Scheduling Tasks Examples: The time is now " + dateFormat().format(new Date()));
    }*/

    //每1分钟执行一次
  /*  @Scheduled(cron = "0 *//*1 *  * * * ")
    public void reportCurrentByCron(){
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }*/

    @Scheduled(cron = "0 0/1 *  * * * ")
    public void reportCurrentByCron(){
        long startTime = System.currentTimeMillis();
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
        System.out.println("runing time=" + (System.currentTimeMillis() - startTime));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
