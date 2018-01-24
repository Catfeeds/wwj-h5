package com.zww.manage.pojo;

/*
 * 运营环境配置
 */
public class OperationParamteterPojo {
	/**
	 * 主类别
	 */
	private String category;
	
	/**
	 * 副类别
	 */
	private String subtype;
	
	/**
	 * 数值
	 */
	private int value;
	
	/**
	 * 概率
	 */
	private int probability;
	
	/**
	 * 备用2
	 */
	private String spareOne;
	
	/**
	 * 备用2
	 */
	private String spareTwo;
	
	/**
	 * 备用3
	 */
	private String spareThree;
	
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 主类别
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 主类别
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 副类别
	 * @return
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * 副类别
	 * @param subtype
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * 数值
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 数值
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 概率值
	 * @return
	 */
	public int getProbability() {
		return probability;
	}

	/**
	 * 概率值
	 * @param probability
	 */
	public void setProbability(int probability) {
		this.probability = probability;
	}

	/**
	 * 备用1
	 * @return
	 */
	public String getSpareOne() {
		return spareOne;
	}

	/**
	 * 备用1
	 * @param spareOne
	 */
	public void setSpareOne(String spareOne) {
		this.spareOne = spareOne;
	}

	/**
	 * 备用2
	 * @return
	 */
	public String getSpareTwo() {
		return spareTwo;
	}

	/**
	 * 备用2
	 * @param spareTwo
	 */
	public void setSpareTwo(String spareTwo) {
		this.spareTwo = spareTwo;
	}

	/**
	 * 备注
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 备用3
	 * @return
	 */
	public String getSpareThree() {
		return spareThree;
	}

	/**
	 * 备用3
	 */
	public void setSpareThree(String spareThree) {
		this.spareThree = spareThree;
	}
}
