package com.zww.trade.vo;

import com.zww.util.AppResponseBody;

/**
 * 积分兑换处理接口的输出用VO
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class PointExchangeHandleOutputVo extends AppResponseBody {

    /**
     * 金币值
     */
    private int gold;

    /**
     * 用户积分值
     */
    private int userPoint;

    /**
     * 金币值
     * @return
     */
    public int getGold() {
        return gold;
    }

    /**
     * 金币值
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
