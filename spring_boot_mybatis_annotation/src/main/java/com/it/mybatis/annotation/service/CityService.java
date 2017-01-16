package com.it.mybatis.annotation.service;



import com.it.mybatis.annotation.model.City;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/26 16:20
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface CityService {
    City getCityByParamyKey(Long id);

/*    List<City> getCityPage(City city);
    Long createCity(City city);*/
}
