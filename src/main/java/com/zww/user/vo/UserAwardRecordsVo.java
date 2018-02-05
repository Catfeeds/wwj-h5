package com.zww.user.vo;

public class UserAwardRecordsVo {
	private String awardId;

	private String userId;

	private String prizeId;

	private String prizeName;

	private String prizeNumber;

	private String prizeStatus;

	private String prizeTime;

	private Integer value;

	private String courierCompany;

	private String courierNumber;

	private String consignee;

	private String telephone;

	private String address;

	private String message  = "";

	/**
	 * 机器ID
	 */
	private String machineId;

	/**
	 * 获奖记录状态名
	 */
	private String statusName;

	public String getAwardId() {
		return awardId;
	}

	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeNumber() {
		return prizeNumber;
	}

	public void setPrizeNumber(String prizeNumber) {
		this.prizeNumber = prizeNumber;
	}

	public String getPrizeStatus() {
		return prizeStatus;
	}

	public void setPrizeStatus(String prizeStatus) {
		this.prizeStatus = prizeStatus;
	}

	public String getPrizeTime() {
		return prizeTime;
	}

	public void setPrizeTime(String prizeTime) {
		this.prizeTime = prizeTime;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getCourierCompany() {
		return courierCompany;
	}

	public void setCourierCompany(String courierCompany) {
		this.courierCompany = courierCompany;
	}

	public String getCourierNumber() {
		return courierNumber;
	}

	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 机器ID
	 * @return
	 */
	public String getMachineId() {
		return machineId;
	}

	/**
	 * 机器ID
	 * @param machineId
	 */
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	/**
	 * 获奖记录状态名
	 * @return
	 */
	public String getStatusName() {
		return statusName;
	}

	/**
	 * 获奖记录状态名
	 * @param statusName
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
}
