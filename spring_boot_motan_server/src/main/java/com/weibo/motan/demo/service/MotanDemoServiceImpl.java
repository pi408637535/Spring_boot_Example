package com.weibo.motan.demo.service;

import com.motan.demo.service.MotanDemoService;
import com.motan.demo.service.model.User;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by piguanghua on 6/12/18.
 */
@MotanService
public class MotanDemoServiceImpl implements MotanDemoService {
    @Override
    public String hello(String name) {
        return "MotanDemoServiceImpl" + name;
    }

    @Override
    public User rename(User user, String name) {
         user.setName("MotanDemoServiceImpl");
         return user;
    }
}
