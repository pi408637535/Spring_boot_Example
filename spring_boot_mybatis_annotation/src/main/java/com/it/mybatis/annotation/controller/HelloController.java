package com.it.mybatis.annotation.controller;


import com.it.mybatis.annotation.model.City;
import com.it.mybatis.annotation.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangpeng24
 * @date 2016/08/11 15:58
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@RestController
public class HelloController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/index/{id}")
    public String index(@PathVariable Long id){
        City city = cityService.getCityByParamyKey(id);
        return city.toString();
    }

    @RequestMapping("/page")
    public List<City> list(){
        City city = new City();
        city.setName("%2");
        List<City> cities = cityService.getCityPage(city);
        return cities;
    }

    @RequestMapping("/create")
   public Long createCity(){
        City city = new City("f", "f", "f");
        return cityService.createCity(city);
    }

}
