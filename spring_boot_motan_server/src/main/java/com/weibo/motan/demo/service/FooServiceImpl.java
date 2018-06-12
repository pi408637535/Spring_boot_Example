package com.weibo.motan.demo.service;

import com.motan.demo.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import java.math.BigDecimal;

/**
 * @Description: 测试服务类
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:24:29
 */

public class FooServiceImpl implements FooService
{
    
    @Override
    public String hello(String name)
    {
        System.err.println("开始进入---------------"+name);
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        return "Hello " + name + "!";
    }

}
