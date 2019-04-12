package com.wode.stock.controller;


import com.alibaba.fastjson.JSON;
import com.wode.stock.model.Country;
import com.wode.stock.server.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhangyuan on 2018/07/06
 */
@Controller
@RequestMapping("/student")
public class StudentConteroller {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentConteroller.class);

    @Autowired
    protected CountryService countryService;

    /**
     * 查询所有的学生信息
     *
     * @param sname
     * @param age
     * @param modelMap
     * @return
     */
    @ResponseBody
    @GetMapping("/list")
    public String list(String sname, Integer age, ModelMap modelMap) {
        String json = null;
        try {
            Country country = new Country();
            List<Country> all = countryService.getAll(country);

            modelMap.put("ren_code", "0");
            modelMap.put("ren_msg", "查询成功");
            modelMap.put("studentList", all);
            json = JSON.toJSONString(modelMap);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("ren_code", "0");
            modelMap.put("ren_msg", "查询失败===>" + e);
            LOGGER.error("查询失败===>" + e);
            json = JSON.toJSONString(modelMap);
        }
        return json;
    }
}
