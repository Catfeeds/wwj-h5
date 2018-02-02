package com.zww.trade.vo;

/**
 * 用户支付功能输入参数VO
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
public class UserPayInputVo {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 房间ID
     */
    private String roomId;

    /**
     * 奖品ID
     */
    private String prizeId;

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
     * 房间ID
     * @return
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * 房间ID
     * @param roomId
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * 奖品ID
     * @return
     */
    public String getPrizeId() {
        return prizeId;
    }

    /**
     * 奖品ID
     * @param prizeId
     */
    public void setPrizeId(String prizeId) {
        this.prizeId = prizeId;
    }
}
