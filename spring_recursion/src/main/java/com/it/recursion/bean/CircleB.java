package com.it.recursion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component
public class CircleB
{

    private CircleC circleC;

    public CircleB()
    {
    }
    @Autowired
    public CircleB(CircleC circleC)
    {
        this.circleC = circleC;
    }

    public void setCircleC(CircleC circleC)
    {
        this.circleC = circleC;
    }

    public void b()
    {
        circleC.c();
    }
}
