package com.it.recursion.construct.bean;

import org.springframework.stereotype.Component;

/**
 * Created by wode4 on 2016/11/17.
 */
@Component("constructCircleA")
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

    public void setCircleB(CircleB circleB)
    {
        this.circleB = circleB;
    }

    public void a()
    {
        circleB.b();
    }
}
