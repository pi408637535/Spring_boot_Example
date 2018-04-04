package com.sample.async;

import com.sample.async.service.AsyncServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.concurrent.Future;

/**
 * Created by piguanghua on 4/3/18.
 */
@SpringBootApplication
public class SpringAsyncApplication implements CommandLineRunner {

    @Resource
    AsyncServices services;

    Logger log = LoggerFactory.getLogger(this.getClass().getName());
    public static void main(String[] args) {
        SpringApplication.run(SpringAsyncApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        Future<String> process1 = services.process();
        Future<String> process2 = services.process();
        Future<String> process3 = services.process();

        // Wait until They are all Done
        // If all are not Done. Pause 2s for next re-check
        while(!(process1.isDone() && process2.isDone() && process3.isDone())){
            Thread.sleep(2000);
        }
        log.info("All Processes are DONE!");
        // Log results
        log.info("Process 1: " + process1.get());
        log.info("Process 2: " + process2.get());
        log.info("Process 3: " + process3.get());
    }
}
