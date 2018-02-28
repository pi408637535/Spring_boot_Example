package com.study.tkmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by piguanghua on 1/18/18.
 */
@SpringBootApplication
@ComponentScan({"com.study.tkmybatis"})
@MapperScan("com.study.tkmybatis.mapper")
public class TkMybatisStudy {

    public static void main(String[] args) throws Exception {
      //  SpringApplication.run(TkMybatisStudy.class, args);
        ApplicationContext ctx =  SpringApplication.run(TkMybatisStudy.class, args);

        String[] beanNames =  ctx.getBeanDefinitionNames();

        System.out.println("所以beanNames个数："+beanNames.length);

        for(String bn:beanNames){

            System.out.println(bn);

        }
    }
}
