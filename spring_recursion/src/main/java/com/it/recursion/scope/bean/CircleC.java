package com.it.recursion.scope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * Created by wode4 on 2016/11/17.
 */
@Component("scopeCircleC")
@Scope("prototype")
public class CircleC
{

    @Autowired()
    private CircleA circleA;

    //  @Autowired
    public CircleC(CircleA circleA)
    {
        this.circleA = circleA;
    }

    public CircleC()
    {
    }

    @Autowired
    public void setCircleA(@Qualifier("scopeCircleA") CircleA circleA)
    {
        this.circleA = circleA;
    }

    public void c()
    {
        circleA.a();
    }
}
