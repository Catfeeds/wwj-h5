package com.zww.sample.vo;

import java.io.Serializable;

/**
 * 登录
 * @author john
 * @since 2017.10.10
 */
public class LoginVo implements Serializable {

	private static final long serialVersionUID = -757306717463123668L;

	/**
	 * 用户id
	 */
	private String id;
	
	/**
	 * 微信openId
	 */
	private String wxopenId;
	
	/**
	 * 融云id
	 */
	private String tokenId;

	/**
	 * 微信unionId
	 */
	private String unionId;

	/**
	 * 用户id
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 用户id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 微信openId
	 * @return
	 */
	public String getWxopenId() {
		return wxopenId;
	}

	/**
	 * 微信openId
	 * @param wxopenId
	 */
	public void setWxopenId(String wxopenId) {
		this.wxopenId = wxopenId;
	}

	/**
	 * 融云id
	 * @return
	 */
	public String getTokenId() {
		return tokenId;
	}

	/**
	 * 融云id
	 * @param tokenId
	 */
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * 微信unionId
	 * @return
	 */
	public String getUnionId() {
		return unionId;
	}

	/**
	 * 微信unionId
	 * @param unionId
	 */
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
}
