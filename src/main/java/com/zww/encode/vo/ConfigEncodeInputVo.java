package com.zww.encode.vo;

/**
 * 生成config信息接口的输入VO
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
public class ConfigEncodeInputVo {

    /**
     * 房间ID
     */
    private String roomId;

    /**
     * session ID
     */
    private String sessionId;

    /**
     * 确认内容,1: 确认上机, 0: 放弃上机
     */
    private int confirm;

    /**
     * 时间戳
     */
    private long timeStamp;

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
     * session ID
     * @return
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * session ID
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 确认内容,1: 确认上机, 0: 放弃上机
     * @return
     */
    public int getConfirm() {
        return confirm;
    }

    /**
     * 确认内容,1: 确认上机, 0: 放弃上机
     * @param confirm
     */
    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    /**
     * 时间戳
     * @return
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * 时间戳
     * @param timeStamp
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
