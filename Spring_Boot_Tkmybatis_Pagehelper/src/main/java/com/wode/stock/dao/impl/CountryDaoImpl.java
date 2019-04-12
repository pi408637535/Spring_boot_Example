package com.wode.stock.dao.impl;

import com.wode.stock.mapper.CountryMapper;
import com.wode.stock.model.Country;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 4/12/19.
 */
@Repository
public class CountryDaoImpl extends BaseDaoImpl<Country> {

    @Resource
    CountryMapper countryMapper;


    @Override
    public Mapper<Country> getMapper() {
        return countryMapper;
    }
}
