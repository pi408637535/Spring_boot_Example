package com.it.recursion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component
public class CircleA
{


    private CircleB circleB;

    public CircleA()
    {
    }
    @Autowired
    public CircleA(CircleB circleB)
    {
        this.circleB = circleB;
    }

    public void setCircleB(CircleB circleB)
    {
        this.circleB = circleB;
    }

    public void a()
    {
        circleB.b();
    }
}
