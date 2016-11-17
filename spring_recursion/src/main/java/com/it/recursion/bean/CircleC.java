package com.it.recursion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component
public class CircleC
{

    @Resource
    private CircleA circleA;

    @Autowired
    public CircleC(CircleA circleA)
    {
        this.circleA = circleA;
    }

    public CircleC()
    {
    }

    public void setCircleA(CircleA circleA)
    {
        this.circleA = circleA;
    }

    public void c()
    {
        circleA.a();
    }
}
