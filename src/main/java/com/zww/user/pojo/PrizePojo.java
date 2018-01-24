package com.zww.user.pojo;

/*
 * 奖品信息
 */
public class PrizePojo {
	private String	awardId;
	
	private String	userId;
	
    private String	prizeId;
	
	private String	consignee;
	
	private String	telephone;
	
	private String	message;
	
	private String	address;
		
	private String prizeName;

	private String introduce;

	private Integer exchange;

	private Integer consume;
	 
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getExchange() {
		return exchange;
	}

	public void setExchange(Integer exchange) {
		this.exchange = exchange;
	}

	public Integer getConsume() {
		return consume;
	}

	public void setConsume(Integer consume) {
		this.consume = consume;
	}
}
