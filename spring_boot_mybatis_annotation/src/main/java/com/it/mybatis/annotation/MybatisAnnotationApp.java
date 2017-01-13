package com.it.mybatis.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by piguanghua on 2017/1/13.
 */
@SpringBootApplication
//@Configuration
//@Import({AutoConfig.class})
@ComponentScan({"com.it.mybatis.annotation"})
public class MybatisAnnotationApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisAnnotationApp.class, args);
    }
}
