package com.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wode4 on 2016/11/7.
 */
@Slf4j
@SpringBootApplication
public class HelloWorld
{

    public static void main(String args[]) {

        log.debug("日志输出测试 Debug");
        log.trace("日志输出测试 Trace");
        log.info("日志输出测试 Info");
        System.out.println("Hello World!");
    }
}
