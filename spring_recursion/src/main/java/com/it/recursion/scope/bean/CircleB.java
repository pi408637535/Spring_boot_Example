package com.it.recursion.scope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component("scopeCircleB")
@Scope("prototype")
public class CircleB
{
    @Autowired
    private CircleC circleC;

    public CircleB()
    {
    }
//    @Autowired
    public CircleB(CircleC circleC)
    {
        this.circleC = circleC;
    }

    @Autowired
    public void setCircleC(@Qualifier("scopeCircleC") CircleC circleC)
    {
        this.circleC = circleC;
    }

    public void b()
    {
        circleC.c();
    }
}
