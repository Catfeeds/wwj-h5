package com.zww.trade.pojo;

import java.math.BigDecimal;

/**
 * 用户充值记录表实体类
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class UserRechargeRecordsPojo {

	/**
	 * 充值支付id
	 */
	private String id;
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 金额
	 */
	private BigDecimal amt;
	
	/**
	 * 充值编号
	 */
	private String number;

	/**
	 * 商品说明
	 */
	private String billExplain;
	
	/**
	 * 充值方式 0-支付宝;1-微信支付;
	 */
	private String kind;
	
	/**
	 * 第三方编号
	 */
	private String outNumber;
	
	/**
	 * 支付状态
	 */
	private String status;

	/**
	 * 表名
	 */
	private String tableName;
	
	/**
	 * 充值支付id
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 充值支付id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 用户id
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 金额
	 * @return
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * 金额
	 * @param amt
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	/**
	 * 充值编号
	 * @return
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 充值编号
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 充值方式 0-支付宝;1-微信支付;
	 * @return
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * 充值方式 0-支付宝;1-微信支付;
	 * @param kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * 第三方编号
	 * @return
	 */
	public String getOutNumber() {
		return outNumber;
	}

	/**
	 * 第三方编号
	 * @param outNumber
	 */
	public void setOutNumber(String outNumber) {
		this.outNumber = outNumber;
	}

	/**
	 * 支付状态
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 支付状态
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 表名
	 * @return
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * 表名
	 * @param tableName
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * 商品说明
	 * @return
	 */
	public String getBillExplain() {
		return billExplain;
	}

	/**
	 * 商品说明
	 * @param billExplain
	 */
	public void setBillExplain(String billExplain) {
		this.billExplain = billExplain;
	}
	
}
