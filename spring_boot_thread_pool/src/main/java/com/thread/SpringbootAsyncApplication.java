package com.thread;

import com.thread.config.TaskThreadPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by piguanghua on 3/23/18.
 */
@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class} ) // 开启配置属性支持
public class SpringbootAsyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAsyncApplication.class, args);
    }
}
