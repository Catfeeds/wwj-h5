package com.zww.util;

import java.time.LocalTime;

/**
 * 玩家状态实体类
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
public class UserQueueStatus {

	public UserQueueStatus(
			String userId, 
			String status, 
			LocalTime time) {
		this.userId = userId;
		this.status = status;
		this.time = time;
	}
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 记录时间
	 */
	private LocalTime time;

	/**
	 * 游戏id
	 */
	private String id;
	
	/**
	 * 设定结果
	 */
	private String set_result;

	/**
	 * 鉴权信息
	 */
	private String customToken;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSet_result() {
		return set_result;
	}

	public void setSet_result(String set_result) {
		this.set_result = set_result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	/**
	 * 鉴权信息
	 * @return
	 */
	public String getCustomToken() {
		return customToken;
	}

	/**
	 * 鉴权信息
	 * @param customToken
	 */
	public void setCustomToken(String customToken) {
		this.customToken = customToken;
	}
}
