package com.study.tkmybatis.common.datasource;

import com.study.tkmybatis.dao.PayOrderDao;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by piguanghua on 2/28/18.
 */
@Aspect
@Component
public class DataSourceAspect {
    @Before("execution(* com.xxx.firstboot.dao.*.*(..))")
    public void setDataSourceKey(JoinPoint point){
        //连接点所属的类实例是ShopDao
        String methodName = point.getSignature().getName();

        if (isSlave(methodName)) {
            // 标记为读库
            DatabaseContextHolder.setDatabaseType(DatabaseType.pay3);
        } else {
            // 标记为写库
            DatabaseContextHolder.setDatabaseType(DatabaseType.pay2);
        }
    }

    /**
     * 判断是否为读库
     *
     * @param methodName
     * @return
     */
    private Boolean isSlave(String methodName) {
        // 方法名以query、find、get开头的方法名走从库
        return StringUtils.startsWithAny(methodName, "query", "find", "get");
    }

}

