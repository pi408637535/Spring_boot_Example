package com.gome.wp.controller;

import com.gome.wp.model.City;
import com.gome.wp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/index")
    public String index(){
        City city = cityService.getCityByParamyKey(1);
        return city.toString();
    }

    @RequestMapping("/page")
    @ResponseBody
    public List<City> list(){
        City city = new City();
        city.setName("%2");
        List<City> cities = cityService.getCityPage(city);
        return cities;
    }
}
