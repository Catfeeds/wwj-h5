package com.zww.user.vo;

/**
 * 奖品相关AIP参数封装类
 * @author lc
 *
 */
public class PrizeParamVo {
	/**
	 * 用户id
	 */
	private String userId;
	  
	/**
	 * 
	 * 奖品id
	 */
	private String prizeId;
	
	private String awardId;
	
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
}
