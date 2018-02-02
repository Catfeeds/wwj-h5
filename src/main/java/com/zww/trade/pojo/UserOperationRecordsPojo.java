package com.zww.trade.pojo;

/**
 * 用户抓取记录
 * 
 * @author john
 * @since 2017.10.21
 */
public class UserOperationRecordsPojo {

	/**
	 * 记录id
	 */
	private String id;
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 最终结果 
	 */
	private String finalResult;
	
	/**
	 * 设定结果
	 */
	private int setResult;
	
	/**
	 * 机器id
	 */
	private String machineId;
	
	/**
	 * 奖品id
	 */
	private String prizeId;

	/**
	 * 表名
	 */
	private String tableName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}

	public int getSetResult() {
		return setResult;
	}

	public void setSetResult(int setResult) {
		this.setResult = setResult;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
