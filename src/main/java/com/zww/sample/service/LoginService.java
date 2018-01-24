package com.zww.sample.service;

import com.zww.sample.vo.LoginVo;

/**
 * 登录
 * @author john
 * @since 2017.10.10
 */
public interface LoginService {

	/**
	 * 根据微信openId登录
	 * @param openId
	 * @param petName
	 * @return
	 */
	public LoginVo login(String openId, String petName,
						 String portraitUri, String unionId);
	
}
