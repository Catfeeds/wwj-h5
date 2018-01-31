package com.zww.trade.vo;

import com.zww.trade.pojo.UserRechargeRecordsPojo;

/**
 * 获取用户积分兑换信息一览接口的输出用VO
 *
 * @author kuang
 * @since 2018.01.31
 * @version 1.0
 */
public class PointExchangeRecordsOutputVo extends UserRechargeRecordsPojo {

    /**
     * 充值方式名： 支付宝;微信支付;积分兑换;
     */
    private String kindName;

    /**
     * 支付状态名：支付成功，支付失败
     */
    private String statusName;

    /**
     * 积分兑换时间
     */
    private String updateTime;

    /**
     * 充值方式名
     * @return
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * 充值方式名
     * @param kindName
     */
    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    /**
     * 支付状态名
     * @return
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 支付状态名
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /**
     * 积分兑换时间
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 积分兑换时间
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
