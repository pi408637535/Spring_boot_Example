package com.zheng.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.zheng.utils.IpUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by zhenglian on 2016/10/7.
 */
@Component
@Aspect

/*
 * 定义切面执行的优先级，数字越低，优先级越高
 * 在切入点之前执行：按order值有小到大的顺序执行
 * 在切入点之后执行：按order值由大到小的顺序执行
 */
@Order(-5)
public class WebLogAspect {
    private Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
    private ThreadLocal<Long> time = new ThreadLocal<>();

    @Pointcut("execution(public * com.zheng.web..*.*(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        time.set(System.currentTimeMillis()); //记录执行开始时间

        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        String ip = request.getRemoteAddr();
        if(ip.indexOf(":0") > -1) { //说明是本地ip
            ip = IpUtil.getLocalRealIp();
        }

        logger.info("IP : " + ip);
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

        //获取所有参数方法一：
        Enumeration<String> enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            logger.info(paraName+": "+request.getParameter(paraName));
        }
    }

    @AfterReturning("pointcut()")
    public void doAfterReturning(JoinPoint joinPoint){
        logger.info("耗时：" + (System.currentTimeMillis() - time.get()) / 1000);
        // 处理完请求，返回内容
        logger.info("WebLogAspect.doAfterReturning()");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("Around before");
        Object returnValue = joinPoint.proceed();
        System.out.println("Around after");
        return returnValue;
    }


}
