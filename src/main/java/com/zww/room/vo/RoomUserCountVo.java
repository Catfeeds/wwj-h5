package com.zww.room.vo;

/**
 * 更新房间人数接口输入参数VO类
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
public class RoomUserCountVo {

    /**
     * 房间ID
     */
    private String roomId;

    /**
     * 房间人数
     */
    private String total;

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
     * 房间人数
     * @return
     */
    public String getTotal() {
        return total;
    }

    /**
     * 房间人数
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }
}
