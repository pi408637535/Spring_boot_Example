package com.it.mybatis.annotation.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;

import java.util.Map;

/**
 * Created by piguanghua on 2017/1/16.
 */
public class TestSqlProvider {
    /** table name, here is test */
    private static final String TABLE_NAME = "city";

    /**
     * get test by id sql script.
     *
     * @param parameters
     * @return
     */
    public String getSql(Map<String, Object> parameters) {
        Long id = (Long) parameters.get("id");
        BEGIN();
        SELECT("name, state");
        FROM(TABLE_NAME);
        if (id != null) {
            WHERE("id = #{id}");
        }
        return SQL();
    }

    /**
     * get all tests sql script.
     *
     * @return
     */
    public String getAllSql() {
        BEGIN();
        SELECT("test_id, test_text");
        FROM(TABLE_NAME);
        return SQL();
    }

    /**
     * get test by test text sql script.
     *
     * @param parameters
     * @return
     */
    public String getByTestTextSql(Map<String, Object> parameters) {
        String tText = (String) parameters.get("testText");
        BEGIN();
        SELECT("test_id, test_text");
        FROM(TABLE_NAME);
        if (tText != null) {
            WHERE("test_text like #{testText,javaType=string,jdbcType=VARCHAR}");
        }
        return SQL();
    }

    /**
     * insert a test sql script.
     *
     * @return
     */
    public String insertSql() {
        BEGIN();
        INSERT_INTO(TABLE_NAME);
        VALUES("test_id", "#{testBean.id,javaType=string,jdbcType=VARCHAR}");
        VALUES("test_text", "#{testBean.testText,javaType=string,jdbcType=VARCHAR}");
        return SQL();
    }

    /**
     * update a test sql script.
     *
     * @return
     */
    public String updateSql() {
        BEGIN();
        UPDATE(TABLE_NAME);
        SET("test_text = #{testBean.testText,javaType=string,jdbcType=VARCHAR}");
        WHERE("test_id = #{testBean.id,javaType=string,jdbcType=VARCHAR}");
        return SQL();
    }

    /**
     * delete a test sql script.
     *
     * @return
     */
    public String deleteSql() {
        BEGIN();
        DELETE_FROM(TABLE_NAME);
        WHERE("test_id = #{id,javaType=string,jdbcType=VARCHAR}");
        return SQL();
    }
}
