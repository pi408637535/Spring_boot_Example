package com.sunney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.stockemtion.stockdata")
public class Application {


    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);

    }

}
