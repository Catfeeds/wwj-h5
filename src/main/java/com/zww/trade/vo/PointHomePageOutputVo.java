package com.zww.trade.vo;

import com.zww.util.AppResponseBody;

/**
 * 积分兑换首页展示接口的输出用VO
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class PointHomePageOutputVo extends AppResponseBody {

    /**
     * 用户金币值
     */
    private int gold;

    /**
     * 用户积分值
     */
    private int point;

    /**
     * 用户金币值
     * @return
     */
    public int getGold() {
        return gold;
    }

    /**
     * 用户金币值
     * @param gold
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * 用户积分值
     * @return
     */
    public int getPoint() {
        return point;
    }

    /**
     * 用户积分值
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }
}
