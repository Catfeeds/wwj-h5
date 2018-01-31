package com.zww.trade.pojo;

import java.math.BigDecimal;

/**
 * 金币套餐表实体类
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class GoldPackagePojo {

    /**
     * 主键id
     */
    private int id;

    /**
     * 套餐编号
     */
    private int packageNo;

    /**
     * 实际金币
     */
    private int actualGold;

    /**
     * 充值金额
     */
    private BigDecimal payAmt;

    /**
     * 主键id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 套餐编号
     * @return
     */
    public int getPackageNo() {
        return packageNo;
    }

    /**
     * 套餐编号
     * @param packageNo
     */
    public void setPackageNo(int packageNo) {
        this.packageNo = packageNo;
    }

    /**
     * 实际金币
     * @return
     */
    public int getActualGold() {
        return actualGold;
    }

    /**
     * 实际金币
     * @param actualGold
     */
    public void setActualGold(int actualGold) {
        this.actualGold = actualGold;
    }

    /**
     * 充值金额
     * @return
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * 充值金额
     * @param payAmt
     */
    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }
}
