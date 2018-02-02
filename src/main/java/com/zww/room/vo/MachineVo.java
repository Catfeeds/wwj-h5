package com.zww.room.vo;

import java.io.Serializable;

/**
 * 主页面展示用VO
 *
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
public class MachineVo implements Serializable {

	private static final long serialVersionUID = 1155991105824831764L;

	/**
	 * 房间id
	 */
	private String roomId;
	
	/**
	 * 奖品id
	 */
	private String prizeId;
	
	/**
	 * 机器状态:0-游戏中;1-空闲中
	 */
	private String machineStatus;
	
	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 */
	private String redPacketStatus;
	
	/**
	 * 奖品名称
	 */
	private String prizeName;

	/**
	 * 奖品介绍
	 */
	private String prizeContext;
	
	/**
	 * 奖品消耗
	 */
	private String playValue;

	/**
	 * 推流1
	 */
	private String push1;

	/**
	 * 推流2
	 */
	private String push2;

	/**
	 * 房间人数
	 */
	private int total;

	/**
	 * 房间ID,对接即构用
	 */
	private String zegoRoomId;

	/**
	 * 房间名,对接即构用
	 */
	private String zegoRoomName;

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
	 * 奖品id
	 * @return
	 */
	public String getPrizeId() {
		return prizeId;
	}

	/**
	 * 奖品id
	 * @param prizeId
	 */
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	/**
	 * 机器状态:0-游戏中;1-空闲中
	 * @return
	 */
	public String getMachineStatus() {
		return machineStatus;
	}

	/**
	 * 机器状态:0-游戏中;1-空闲中
	 * @param machineStatus
	 */
	public void setMachineStatus(String machineStatus) {
		this.machineStatus = machineStatus;
	}

	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 * @return
	 */
	public String getRedPacketStatus() {
		return redPacketStatus;
	}

	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 * @param redPacketStatus
	 */
	public void setRedPacketStatus(String redPacketStatus) {
		this.redPacketStatus = redPacketStatus;
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
	public String getPrizeContext() {
		return prizeContext;
	}

	/**
	 * 奖品介绍
	 * @param prizeContext
	 */
	public void setPrizeContext(String prizeContext) {
		this.prizeContext = prizeContext;
	}

	/**
	 * 奖品消耗
	 * @return
	 */
	public String getPlayValue() {
		return playValue;
	}

	/**
	 * 奖品消耗
	 * @param playValue
	 */
	public void setPlayValue(String playValue) {
		this.playValue = playValue;
	}

	/**
	 * 推流1
	 * @return
	 */
	public String getPush1() {
		return push1;
	}

	/**
	 * 推流1
	 * @param push1
	 */
	public void setPush1(String push1) {
		this.push1 = push1;
	}

	/**
	 * 推流2
	 * @return
	 */
	public String getPush2() {
		return push2;
	}

	/**
	 * 推流2
	 * @param push2
	 */
	public void setPush2(String push2) {
		this.push2 = push2;
	}

	/**
	 * 房间人数
	 * @return
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 房间人数
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * 房间ID,对接即构用
	 * @return
	 */
	public String getZegoRoomId() {
		return zegoRoomId;
	}

	/**
	 * 房间ID,对接即构用
	 * @param zegoRoomId
	 */
	public void setZegoRoomId(String zegoRoomId) {
		this.zegoRoomId = zegoRoomId;
	}

	/**
	 * 房间名,对接即构用
	 * @return
	 */
	public String getZegoRoomName() {
		return zegoRoomName;
	}

	/**
	 * 房间名,对接即构用
	 * @param zegoRoomName
	 */
	public void setZegoRoomName(String zegoRoomName) {
		this.zegoRoomName = zegoRoomName;
	}
}
