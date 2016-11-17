package com.it.recursion;


import com.it.recursion.construct.bean.CircleA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wode4 on 2016/11/17.
 */
@Controller
@SpringBootApplication
public class Recursion
{
    com.it.recursion.scope.bean.CircleA scopeCircleA;
    com.it.recursion.construct.bean.CircleA constructCircleA;

    @Autowired
    public void setCircleA(@Qualifier("scopeCircleA")com.it.recursion.scope.bean.CircleA scopeCircleA,
        @Qualifier("constructCircleA")com.it.recursion.construct.bean.CircleA constructCircleA){
        this.scopeCircleA = scopeCircleA;
        this.constructCircleA = constructCircleA;
    }


    @RequestMapping("/")
    @ResponseBody
    String home() {
       // circleA.a();
        Recursion recursion = new Recursion();
        System.out.println(scopeCircleA);
        System.out.println(constructCircleA);

        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Recursion.class, args);
    }
}
