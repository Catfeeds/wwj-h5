package com.zww.user.service;

import com.zww.user.vo.AddUserInfoInputVo;
import com.zww.user.vo.ShowUserAwardStatusOutputVo;
import com.zww.user.vo.UserAwardRecordsVo;
import com.zww.user.vo.UserBaseVo;
import com.zww.util.AppResponseBody;

import java.util.List;

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

	/**
	 * 中奖列表
	 * @param userId
	 * @return
	 */
	public List<UserAwardRecordsVo> prizeList(String userId);

	/**
	 * 个人信息追加
	 * @param vo
	 * @return
	 */
	AppResponseBody addUserInfo(AddUserInfoInputVo vo);

	/**
	 * 获取用户获奖记录状态
	 * @param userId
	 * @param id
	 * @return
	 */
	ShowUserAwardStatusOutputVo getUserAwardStatus(int userId, int id);
	
}
