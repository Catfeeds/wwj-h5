package com.zww.room.vo;

/**
 * 该房间的最近抓中记录接口返回VO
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
public class RoomLatelyAwardRecordsVo {

    /**
     * 用户id
     */
    private int userId;

    /**
     * 房间ID
     */
    private int machineId;

    /**
     * 奖品ID
     */
    private int prizeId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 抓中时间
     */
    private String createTime;

    /**
     * 用户id
     * @return
     */
    public int getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 房间ID
     * @return
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * 房间ID
     * @param machineId
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    /**
     * 奖品ID
     * @return
     */
    public int getPrizeId() {
        return prizeId;
    }

    /**
     * 奖品ID
     * @param prizeId
     */
    public void setPrizeId(int prizeId) {
        this.prizeId = prizeId;
    }

    /**
     * 用户昵称
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户昵称
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 抓中时间
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 抓中时间
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
