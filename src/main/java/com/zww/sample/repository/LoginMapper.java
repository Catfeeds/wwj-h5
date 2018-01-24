package com.zww.sample.repository;

import com.zww.sample.vo.LoginVo;
import org.springframework.stereotype.Component;

/**
 * 登录
 * @author john
 * @since 2017.10.10
 */
@Component
public interface LoginMapper {

	/**
	 * 根据微信openId查询用户id
	 * 
	 * @param unionId 微信登录openId
	 * @return 用户信息
	 */
	LoginVo queryUserInfoByUnionId(String unionId);
	
//	/**
//	 * 插入新用户信息
//	 *
//	 * @param pojo 用户信息
//	 * @return 用户id
//	 */
//	public int insertUserInfo(LoginPojo pojo);
//
//	/**
//	 * 插入新用户基本信息
//	 * @param record
//	 * @return
//	 */
//	public int insertNewUserInfo(UserBasePojo record);
//
//
//	/**
//	 * 更新token
//	 * @param newToken
//	 * @return
//	 */
//	public int updateUserTokenById(@Param("newToken") String newToken,
//                                   @Param("userId") String userId,
//                                   @Param("unionId") String unionId);
//
//	/**
//	 * 查询用户昵称
//	 * @param userId
//	 * @return
//	 */
//	public UserBaseVo queryUserName(String userId);
	
}
