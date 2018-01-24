package com.zww.user.service;

import com.zww.user.vo.UserBaseVo;

public interface PersonalCenterService {

	/**根据id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	public UserBaseVo showUserInfo(String id);
	
	
	/**
	 *  修改昵称
	 * @param newName
	 * @param id
	 * @return
	 */
	public int modifyUserName(String newName, String id);
	
	/**
	 * 修改用户头像
	 * @param sign
	 * @return
	 */
	public int modifyUserHeadNumber(String userId);
	
}
