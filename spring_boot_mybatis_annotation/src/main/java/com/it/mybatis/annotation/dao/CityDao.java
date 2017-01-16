package com.it.mybatis.annotation.dao;

import com.it.mybatis.annotation.mapper.TestMapper;
import com.it.mybatis.annotation.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 2017/1/16.
 */
@Repository
public class CityDao {
    @Resource
    TestMapper testMapper;

    public City getCityById(Long id){
       return testMapper.get(id);
    }
}
