package com.zww.user.vo;

public class ParamVo {
	/**
	 * 用户id    
	 */
	private String userId;
	
	/**
	 * 昵称
	 */
	private String newName;
	
	/**
	 * 用户头像uri
	 */
	private String portraitUri;
	
	/**
	 * 用户唯一标示
	 */
	private String openId;
	
	private String value;
	
	private String sign;
	
	private String reason;
	
	private String tableName;

	
	public String getPortraitUri() {
		return portraitUri;
	}

	public void setPortraitUri(String portraitUri) {
		this.portraitUri = portraitUri;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

}
