package com.zww.user.pojo;

/*
 * 用户基本信息
 */
public class UserBasePojo {
	private String userId;

	private String userName;

	private int portraitNum;

	private int experience;

	private int gold;

	private int redPacketValue;

	private int userPoint;

	private String inviteCode;

	private String exchangeCode;

	private String userLoginChannel;

	private int userPayFlag;

	private int effective;

	private String passwd;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPortraitNum(int portraitNum) {
		this.portraitNum = portraitNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public Integer getPortraitNum() {
		return portraitNum;
	}

	public void setPortraitNum(Integer portraitNum) {
		this.portraitNum = portraitNum;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public int getRedPacketValue() {
		return redPacketValue;
	}

	public void setRedPacketValue(int redPacketValue) {
		this.redPacketValue = redPacketValue;
	}

	public int getUserPoint() {
		return userPoint;
	}

	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode == null ? null : inviteCode.trim();
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode == null ? null : exchangeCode.trim();
	}

	public String getUserLoginChannel() {
		return userLoginChannel;
	}

	public void setUserLoginChannel(String userLoginChannel) {
		this.userLoginChannel = userLoginChannel;
	}

	public int getUserPayFlag() {
		return userPayFlag;
	}

	public void setUserPayFlag(int userPayFlag) {
		this.userPayFlag = userPayFlag;
	}

	public int getEffective() {
		return effective;
	}

	public void setEffective(int effective) {
		this.effective = effective;
	}
}
