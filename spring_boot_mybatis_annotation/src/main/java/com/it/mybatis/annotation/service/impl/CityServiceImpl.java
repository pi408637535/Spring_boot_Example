package com.it.mybatis.annotation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.it.mybatis.annotation.mapper.CityMapper;
import com.it.mybatis.annotation.mapper.TestMapper;
import com.it.mybatis.annotation.model.City;
import com.it.mybatis.annotation.model.CityExample;
import com.it.mybatis.annotation.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/26 16:21
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public City getCityByParamyKey(Long id) {
        if(null==id){
            return null;
        }
        return testMapper.get(id);

    }

   
}
