package com.study.tkmybatis.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by piguanghua on 2/28/18.
 * 动态数据源
 * 作用：使用DatabaseContextHolder获取当前线程的DatabaseType
 * 定义动态数据源，实现通过集成Spring提供的AbstractRoutingDataSource，只需要实现determineCurrentLookupKey方法即可
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }

    /**
     * 一主多从
     * http://blog.csdn.net/zbw18297786698/article/details/54343188
     */
}
