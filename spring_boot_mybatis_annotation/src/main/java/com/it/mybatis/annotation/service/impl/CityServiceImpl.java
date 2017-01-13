package com.it.mybatis.annotation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.it.mybatis.annotation.mapper.CityMapper;
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
    private CityMapper cityMapper;

    @Override
    public City getCityByParamyKey(Long id) {
        if(null==id){
            return null;
        }
        CityExample cityExample = new CityExample();
        CityExample.Criteria criteria = cityExample.createCriteria();
        City city = cityMapper.selectByPrimaryKey(id);

        return city;
    }

    @Override
    public List<City> getCityPage(City city) {
        PageHelper.startPage(1,2);
        CityExample cityExample = new CityExample();
        List<City> cities = cityMapper.selectByExample(cityExample);
        PageInfo<City> pageInfo = new PageInfo<>(cities);
        return null;
    }

    @Override
    public Long createCity(City city)
    {
        cityMapper.insert(city);
        return city.getId();
    }
}
