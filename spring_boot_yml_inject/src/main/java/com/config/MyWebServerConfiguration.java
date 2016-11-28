package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by wode3 on 2016/11/28.
 */
@Component
@Configuration
@EnableConfigurationProperties(MyWebServerConfigurationProperties.class)
public class MyWebServerConfiguration {
    @Autowired
    private MyWebServerConfigurationProperties properties;

    public void getConfig(){
        System.out.println(properties.getPort());
    }


}
