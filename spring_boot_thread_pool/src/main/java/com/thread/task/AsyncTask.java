package com.thread.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by piguanghua on 3/23/18.
 */
@Component
public class AsyncTask {
    @Async("myTaskAsyncPool") //myTaskAsynPool即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public void doTask1(int i) throws InterruptedException{
        System.out.println("Task"+i+" started.");
        System.out.println("TaskName="+ Thread.currentThread().getName());
    }
}
