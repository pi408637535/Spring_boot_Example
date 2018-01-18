package com.study.tkmybatis;

import com.study.tkmybatis.dao.CmsActivityHistoryDao;
import com.study.tkmybatis.mapper.CmsActivityHistoryMapper;
import com.study.tkmybatis.model.CmsActivityHistory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by piguanghua on 1/18/18.
 */
@SpringBootApplication
@MapperScan("com.study.tkmybatis.mapper")
@ComponentScan({"com.study.tkmybatis"})
public class TkMybatisStudy {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TkMybatisStudy.class, args);
    }
}
