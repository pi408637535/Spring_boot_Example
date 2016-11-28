package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wode3 on 2016/11/28.
 */
@SpringBootApplication
@ComponentScan({"com"})
public class Application {
    public static void main(String[] args) {
        // 启动Spring Boot项目的唯一入口
        SpringApplication app = new SpringApplication(Application.class);
      //  app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
