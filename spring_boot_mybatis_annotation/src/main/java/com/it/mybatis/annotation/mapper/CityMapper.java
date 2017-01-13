package com.it.mybatis.annotation.mapper;


import com.it.mybatis.annotation.model.City;
import com.it.mybatis.annotation.model.CityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Long id);

    Long insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}