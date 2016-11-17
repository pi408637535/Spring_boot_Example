package com.it.recursion;



import com.it.recursion.scope.bean.CircleA;
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
    /**
     * 实践 @Autowired 和 @Qualifier 联合使用
     * com.it.recursion.scope.bean.CircleA scopeCircleA;
    com.it.recursion.construct.bean.CircleA constructCircleA;

    @Autowired
    public void setCircleA(@Qualifier("scopeCircleA")com.it.recursion.scope.bean.CircleA scopeCircleA,
        @Qualifier("constructCircleA")com.it.recursion.construct.bean.CircleA constructCircleA){
        this.scopeCircleA = scopeCircleA;
        this.constructCircleA = constructCircleA;
    }*/

    private CircleA circleA;

    @Autowired
    public void setCircleA(@Qualifier("scopeCircleA") CircleA circleA)
    {
        this.circleA = circleA;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
       // circleA.a();

        System.out.println(circleA);

        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Recursion.class, args);
    }
}
