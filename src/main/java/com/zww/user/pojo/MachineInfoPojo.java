package com.zww.user.pojo;

public class MachineInfoPojo {

	/**
	 * 机器id
	 */
	private String id;
	
	/**
	 * 奖品id
	 */
	private String prizeId;
	
	/**
	 * 机器状态:0-游戏中;1-空闲中
	 */
	//private String machineStatus;
	
	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 */
	//private String redPacketStatus;
	
	/**
	 * 奖品名称
	 */
	private String prizeName;

	/**
	 * 奖品介绍
	 */
	private String introduce;
	
	/**
	 * 奖品消耗
	 */
	private String consume;

	/**
	 * 机器id
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 机器id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
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
	/*public String getMachineStatus() {
		return machineStatus;
	}*/

	/**
	 * 机器状态:0-游戏中;1-空闲中
	 * @param machineStatus
	 */
	/*public void setMachineStatus(String machineStatus) {
		this.machineStatus = machineStatus;
	}*/

	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 * @return
	 */
	/*public String getRedPacketStatus() {
		return redPacketStatus;
	}*/

	/**
	 * 红包状态：0-非红包机器;1-红包机器
	 * @param redPacketStatus
	 */
	/*public void setRedPacketStatus(String redPacketStatus) {
		this.redPacketStatus = redPacketStatus;
	}*/

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
	 * 奖品消耗
	 * @return
	 */
	public String getConsume() {
		return consume;
	}

	/**
	 * 奖品消耗
	 * @param exchange
	 */
	public void setExchange(String consume) {
		this.consume = consume;
	}

}
