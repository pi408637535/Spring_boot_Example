package com.gome.wp.dao;

import com.gome.wp.model.City;
import com.gome.wp.model.CityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/26 16:17
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface CityMapper{

    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}
