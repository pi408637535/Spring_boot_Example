package com.wode.stock;

import org.mybatis.spring.annotation.MapperScan;
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
public class StockEmotionStudy {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StockEmotionStudy.class, args);
    }
}
