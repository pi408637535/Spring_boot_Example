package com.wode.stock;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author wanghongda @date 2018年1月22日
 */
@SpringBootApplication
@MapperScan("com.wode.stock.mapper")
@ComponentScan({"com.wode.stock"})
@Slf4j
public class StockEmotionStudy implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StockEmotionStudy.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("服务启动完成!");
    }
}
