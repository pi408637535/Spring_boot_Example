package com.it.recursion.scope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component("scopeCircleA")
@Scope("prototype")
public class CircleA
{


    private CircleB circleB;



    public CircleA()
    {
    }
  //  @Autowired
    public CircleA(CircleB circleB)
    {
        this.circleB = circleB;
    }

    @Autowired
    public void setCircleB(@Qualifier("scopeCircleB") CircleB circleB)
    {
        this.circleB = circleB;
    }

    public void a()
    {
        circleB.b();
    }
}
