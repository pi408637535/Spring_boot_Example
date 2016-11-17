package com.it.recursion.construct.bean;

import org.springframework.stereotype.Component;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component
public class CircleC
{


    private CircleA circleA;

  //  @Autowired
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
