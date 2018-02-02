package com.zww.user.repository;

import java.util.List;
import java.util.Map;

import com.zww.user.pojo.UserAwardRecords1Pojo;
import com.zww.user.pojo.UserBasePojo;
import com.zww.user.pojo.UserLoginPojo;
import com.zww.user.vo.UserAwardRecords1Vo;
import com.zww.user.vo.UserBaseVo;
import org.springframework.stereotype.Component;

@Component
public interface PersonalCenterMapper {
	
	/**
	 * 用户信息查询
	 * @param id
	 * @return
	 */
	public UserBaseVo queryUserInfoByUserId(String id);
	
	
	 /**
     * 用户获奖数
     * @param userId
     * @return
     */
    public Long countRecordByuserId(Map<String, String> map);
    
    
    /**
	 * 娃娃图片id列表
	 * @param map
	 * @return
	 */
	List<UserAwardRecords1Pojo> queryUserPrizePic(Map<String, String> map);
	
	
	/**
	 * 改昵称
	 * @param map
	 * @return
	 */
	public int updatePetName(UserBasePojo userBasePojo);
	
	
	/**
	 * 更新用户金币
	 * @param gold
	 * @param userId
	 * @return
	 */
	public int updateGoldsByUserId(String userId);
	
	
	/**
	 * 更新头像序列号
	 * @return
	 */
	public int updateHead(String userId);

	/**
	 * 用户奖品列表
	 * @param map
	 * @return
	 */
	List<UserAwardRecords1Vo> queryUserPrizes(Map<String , String> map);

	/**
	 * 根据第三方用户登录ID获取用户ID
	 * @param loginId
	 * @return
	 */
	int queryUserIdByLoginId(String loginId);

	/**
	 * 追加用户登录表信息
	 * @param param
	 * @return
	 */
	int insertUserLoginInfo(UserLoginPojo param);

	/**
	 * 追加个人资料表信息
	 * @param param
	 * @return
	 */
	int insertUserBaseInfo(UserBasePojo param);
	
}
