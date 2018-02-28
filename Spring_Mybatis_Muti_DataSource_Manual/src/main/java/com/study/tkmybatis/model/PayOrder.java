package com.study.tkmybatis.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "pay_order")
public class PayOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 内部平台支付账单 数字不重叠
     */
    @Column(name = "internal_no")
    private String internalNo;

    /**
     * 交易状态:0.未付款,1,下单 2.已付款,3.取消,4.支付失败
     */
    private Byte state;

    /**
     * 此单总额
     */
    private BigDecimal amount;

    /**
     * 此订单的总兑换积分
     */
    @Column(name = "amount_exchange_score")
    private Integer amountExchangeScore;

    /**
     * 支付总金额
     */
    private BigDecimal payment;

    /**
     * 商品打折+会员等级打折
     */
    @Column(name = "total_rebate")
    private BigDecimal totalRebate;

    @Column(name = "sys_create_time")
    private Date sysCreateTime;

    @Column(name = "sys_update_time")
    private Date sysUpdateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取内部平台支付账单 数字不重叠
     *
     * @return internal_no - 内部平台支付账单 数字不重叠
     */
    public String getInternalNo() {
        return internalNo;
    }

    /**
     * 设置内部平台支付账单 数字不重叠
     *
     * @param internalNo 内部平台支付账单 数字不重叠
     */
    public void setInternalNo(String internalNo) {
        this.internalNo = internalNo == null ? null : internalNo.trim();
    }

    /**
     * 获取交易状态:1.未付款,2.已付款,3.取消,4.支付失败
     *
     * @return state - 交易状态:1.未付款,2.已付款,3.取消,4.支付失败
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置交易状态:1.未付款,2.已付款,3.取消,4.支付失败
     *
     * @param state 交易状态:1.未付款,2.已付款,3.取消,4.支付失败
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取此单总额
     *
     * @return amount - 此单总额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置此单总额
     *
     * @param amount 此单总额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取此订单的总兑换积分
     *
     * @return amount_exchange_score - 此订单的总兑换积分
     */
    public Integer getAmountExchangeScore() {
        return amountExchangeScore;
    }

    /**
     * 设置此订单的总兑换积分
     *
     * @param amountExchangeScore 此订单的总兑换积分
     */
    public void setAmountExchangeScore(Integer amountExchangeScore) {
        this.amountExchangeScore = amountExchangeScore;
    }

    /**
     * 获取支付总金额
     *
     * @return payment - 支付总金额
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * 设置支付总金额
     *
     * @param payment 支付总金额
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * 获取商品打折+会员等级打折
     *
     * @return total_rebate - 商品打折+会员等级打折
     */
    public BigDecimal getTotalRebate() {
        return totalRebate;
    }

    /**
     * 设置商品打折+会员等级打折
     *
     * @param totalRebate 商品打折+会员等级打折
     */
    public void setTotalRebate(BigDecimal totalRebate) {
        this.totalRebate = totalRebate;
    }

    /**
     * @return sys_create_time
     */
    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    /**
     * @param sysCreateTime
     */
    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    /**
     * @return sys_update_time
     */
    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    /**
     * @param sysUpdateTime
     */
    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }
}