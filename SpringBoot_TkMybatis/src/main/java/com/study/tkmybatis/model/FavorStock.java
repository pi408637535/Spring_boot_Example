package com.study.tkmybatis.model;

/**
 * Created by piguanghua on 1/18/18.
 */

import java.util.Date;
import javax.persistence.*;

@Table(name = "favor_stock")
public class FavorStock {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 股票编码
     */
    @Column(name = "stock_code")
    private String stockCode;

    /**
     * 0 个股，1大盘
     */
    @Column(name = "stock_type")
    private Integer stockType;

    /**
     * 0 自选，1盯盘
     */
    @Column(name = "favor_type")
    private Integer favorType;

    /**
     * wd信号
     */
    @Column(name = "wd_enable")
    private Integer wdEnable;

    /**
     * 价格上涨
     */
    @Column(name = "price_up")
    private Float priceUp;

    /**
     * 价格下跌
     */
    @Column(name = "price_down")
    private Float priceDown;

    @Column(name = "price_percent")
    private Float pricePercent;

    /**
     * 创建时间
     */
    @Column(name = "sys_create_date")
    private Date sysCreateDate;

    /**
     * 修改时间
     */
    @Column(name = "sys_last_update")
    private Date sysLastUpdate;

    /**
     * 异动
     */
    private Boolean abnormal;

    /**
     * 涨跌停
     */
    @Column(name = "daily_limit")
    private Boolean dailyLimit;

    /**
     * 跌幅
     */
    @Column(name = "percent_down")
    private Float percentDown;

    /**
     * 涨幅
     */
    @Column(name = "percent_up")
    private Float percentUp;

    /**
     * 股票名称
     */
    @Column(name = "stock_name")
    private String stockName;

    /**
     * 判断该条是否是收费条件
     */
    private Boolean franco;

    /**
     * redis中新版股票编码
     */
    @Column(name = "stock_code_redis")
    private String stockCodeRedis;

    /**
     * 获取自增id
     *
     * @return id - 自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取股票编码
     *
     * @return stock_code - 股票编码
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * 设置股票编码
     *
     * @param stockCode 股票编码
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    /**
     * 获取0 个股，1大盘
     *
     * @return stock_type - 0 个股，1大盘
     */
    public Integer getStockType() {
        return stockType;
    }

    /**
     * 设置0 个股，1大盘
     *
     * @param stockType 0 个股，1大盘
     */
    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    /**
     * 获取0 自选，1盯盘
     *
     * @return favor_type - 0 自选，1盯盘
     */
    public Integer getFavorType() {
        return favorType;
    }

    /**
     * 设置0 自选，1盯盘
     *
     * @param favorType 0 自选，1盯盘
     */
    public void setFavorType(Integer favorType) {
        this.favorType = favorType;
    }

    /**
     * 获取wd信号
     *
     * @return wd_enable - wd信号
     */
    public Integer getWdEnable() {
        return wdEnable;
    }

    /**
     * 设置wd信号
     *
     * @param wdEnable wd信号
     */
    public void setWdEnable(Integer wdEnable) {
        this.wdEnable = wdEnable;
    }

    /**
     * 获取价格上涨
     *
     * @return price_up - 价格上涨
     */
    public Float getPriceUp() {
        return priceUp;
    }

    /**
     * 设置价格上涨
     *
     * @param priceUp 价格上涨
     */
    public void setPriceUp(Float priceUp) {
        this.priceUp = priceUp;
    }

    /**
     * 获取价格下跌
     *
     * @return price_down - 价格下跌
     */
    public Float getPriceDown() {
        return priceDown;
    }

    /**
     * 设置价格下跌
     *
     * @param priceDown 价格下跌
     */
    public void setPriceDown(Float priceDown) {
        this.priceDown = priceDown;
    }

    /**
     * @return price_percent
     */
    public Float getPricePercent() {
        return pricePercent;
    }

    /**
     * @param pricePercent
     */
    public void setPricePercent(Float pricePercent) {
        this.pricePercent = pricePercent;
    }

    /**
     * 获取创建时间
     *
     * @return sys_create_date - 创建时间
     */
    public Date getSysCreateDate() {
        return sysCreateDate;
    }

    /**
     * 设置创建时间
     *
     * @param sysCreateDate 创建时间
     */
    public void setSysCreateDate(Date sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }

    /**
     * 获取修改时间
     *
     * @return sys_last_update - 修改时间
     */
    public Date getSysLastUpdate() {
        return sysLastUpdate;
    }

    /**
     * 设置修改时间
     *
     * @param sysLastUpdate 修改时间
     */
    public void setSysLastUpdate(Date sysLastUpdate) {
        this.sysLastUpdate = sysLastUpdate;
    }

    /**
     * 获取异动
     *
     * @return abnormal - 异动
     */
    public Boolean getAbnormal() {
        return abnormal;
    }

    /**
     * 设置异动
     *
     * @param abnormal 异动
     */
    public void setAbnormal(Boolean abnormal) {
        this.abnormal = abnormal;
    }

    /**
     * 获取涨跌停
     *
     * @return daily_limit - 涨跌停
     */
    public Boolean getDailyLimit() {
        return dailyLimit;
    }

    /**
     * 设置涨跌停
     *
     * @param dailyLimit 涨跌停
     */
    public void setDailyLimit(Boolean dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    /**
     * 获取跌幅
     *
     * @return percent_down - 跌幅
     */
    public Float getPercentDown() {
        return percentDown;
    }

    /**
     * 设置跌幅
     *
     * @param percentDown 跌幅
     */
    public void setPercentDown(Float percentDown) {
        this.percentDown = percentDown;
    }

    /**
     * 获取涨幅
     *
     * @return percent_up - 涨幅
     */
    public Float getPercentUp() {
        return percentUp;
    }

    /**
     * 设置涨幅
     *
     * @param percentUp 涨幅
     */
    public void setPercentUp(Float percentUp) {
        this.percentUp = percentUp;
    }

    /**
     * 获取股票名称
     *
     * @return stock_name - 股票名称
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * 设置股票名称
     *
     * @param stockName 股票名称
     */
    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    /**
     * 获取判断该条是否是收费条件
     *
     * @return franco - 判断该条是否是收费条件
     */
    public Boolean getFranco() {
        return franco;
    }

    /**
     * 设置判断该条是否是收费条件
     *
     * @param franco 判断该条是否是收费条件
     */
    public void setFranco(Boolean franco) {
        this.franco = franco;
    }

    /**
     * 获取redis中新版股票编码
     *
     * @return stock_code_redis - redis中新版股票编码
     */
    public String getStockCodeRedis() {
        return stockCodeRedis;
    }

    /**
     * 设置redis中新版股票编码
     *
     * @param stockCodeRedis redis中新版股票编码
     */
    public void setStockCodeRedis(String stockCodeRedis) {
        this.stockCodeRedis = stockCodeRedis == null ? null : stockCodeRedis.trim();
    }
}
