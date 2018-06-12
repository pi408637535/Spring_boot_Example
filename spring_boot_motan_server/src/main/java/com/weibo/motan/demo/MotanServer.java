package com.weibo.motan.demo;


import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Description: 启动类
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:24:18
 */
@SpringBootApplication
public class MotanServer
{
    public static void main(String[] args)
    {
        String[]  strings = SpringApplication.run(MotanServer.class).getBeanDefinitionNames();
        for(String str : strings){
            System.out.println(str);
        }

      //  SpringApplication.run(MotanServer.class, args);
        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
        System.out.println("server start...");
    }
    
}