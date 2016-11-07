package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wode4 on 2016/11/7.
 */
public class HelloWorld
{
    public static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String args[]) {

        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
        System.out.println("Hello World!");
    }
}
