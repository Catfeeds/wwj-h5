package com.zww.user.vo;

public class PrizeVo {
private String prizeId;
	
	private String prizeName;
	 
	private String prizeTime;
	 
	private String prizeNumber;
	 
	private String privateStatus;
	
	private String status;
	
	private int exchange;
	
	private int consume;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	public int getExchange() {
		return exchange;
	}

	public void setExchange(int exchange) {
		this.exchange = exchange;
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

	public String getPrizeTime() {
		return prizeTime;
	}

	public void setPrizeTime(String prizeTime) {
		this.prizeTime = prizeTime;
	}

	public String getPrizeNumber() {
		return prizeNumber;
	}

	public void setPrizeNumber(String prizeNumber) {
		this.prizeNumber = prizeNumber;
	}

	public String getPrivateStatus() {
		return privateStatus;
	}

	public void setPrivateStatus(String privateStatus) {
		this.privateStatus = privateStatus;
	}
}
