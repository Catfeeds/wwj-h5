package com.zww.trade.vo;

import com.zww.trade.pojo.GoldPackagePojo;

/**
 * 积分兑换处理接口的输入用VO
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class PointExchangeHandleInputVo extends GoldPackagePojo {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 第三方用户ID
     */
    private String loginId;

    /**
     * 用户金币数
     */
    private int gold;

    /**
     * 用户积分值
     */
    private int userPoint;

    /**
     * 用户ID
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 第三方用户ID
     * @return
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 第三方用户ID
     * @param loginId
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 用户金币数
     * @return
     */
    public int getGold() {
        return gold;
    }

    /**
     * 用户金币数
     * @param gold
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * 用户积分值
     * @return
     */
    public int getUserPoint() {
        return userPoint;
    }

    /**
     * 用户积分值
     * @param userPoint
     */
    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }
}
