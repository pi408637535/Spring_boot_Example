package com.study.tkmybatis.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by piguanghua on 2/28/18.
 * 动态数据源
 * 作用：使用DatabaseContextHolder获取当前线程的DatabaseType
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }
}
