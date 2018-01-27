package com.zww.room.vo;

/**
 * 房间奖品详情展示用输出VO
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
public class RoomDetailShowVo {

    /**
     * 房间ID
     */
    private int roomId;

    /**
     * 奖品ID
     */
    private int prizeId;

    /**
     * 奖品名称
     */
    private String prizeName;

    /**
     * 奖品介绍
     */
    private String introduce;

    /**
     * 奖品价值
     */
    private int exchange;

    /**
     * 抽奖消耗
     */
    private int consume;

    /**
     * 房间ID
     * @return
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * 房间ID
     * @param roomId
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
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
     * 奖品名称
     * @return
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * 奖品名称
     * @param prizeName
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    /**
     * 奖品介绍
     * @return
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 奖品介绍
     * @param introduce
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 奖品价值
     * @return
     */
    public int getExchange() {
        return exchange;
    }

    /**
     * 奖品价值
     * @param exchange
     */
    public void setExchange(int exchange) {
        this.exchange = exchange;
    }

    /**
     * 抽奖消耗
     * @return
     */
    public int getConsume() {
        return consume;
    }

    /**
     * 抽奖消耗
     * @param consume
     */
    public void setConsume(int consume) {
        this.consume = consume;
    }
}
