package com.zww.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zww.constants.DbConstants;
import com.zww.user.pojo.UserLoginPojo;
import com.zww.user.vo.AddUserInfoInputVo;
import com.zww.user.vo.UserAwardRecords1Vo;
import com.zww.util.AppResponseBody;
import com.zww.util.CodeRuleUtils;
import com.zww.util.ConversionUtils;
import com.zww.util.TablesUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zww.manage.service.OperationParameterService;
import com.zww.user.pojo.UserBasePojo;
import com.zww.user.repository.PersonalCenterMapper;
import com.zww.user.service.PersonalCenterService;
import com.zww.user.vo.UserBaseVo;
import org.springframework.stereotype.Service;

@Service
public class PersonalCenterServiceImpl implements PersonalCenterService{
	@Resource
	private PersonalCenterMapper personalCenterMapper;
	
	@Autowired
	private OperationParameterService operationParameterService;
	/**
	 * 
	 * 展示用户信息
	 */
	@Override
	public UserBaseVo showUserInfo(String id) {
		// TODO Auto-generated method stub
		UserBaseVo theUserBase = personalCenterMapper.queryUserInfoByUserId(id);
		
		String level = ConversionUtils.expToLevel(theUserBase.getExperience());
		theUserBase.setUserLevel(level);
		theUserBase.setBalance(theUserBase.getGold().toString());
		
		Map<String, String> map = new HashMap<>(2);
		String table = TablesUtils.segmentation(id, DbConstants.USER_AWARD_RECORDS);
		map.put("tableName", table);
		map.put("userId", "'" + id + "'");  

		int prizeNum = personalCenterMapper.countRecordByuserId(map).intValue();
		theUserBase.setPrizeNum(prizeNum);
		
		theUserBase.setPictureIds(personalCenterMapper.queryUserPrizePic(map));
		
		return theUserBase;
	}
	/**
	 * 输入邀请码
	 */
	@Override
	public int modifyUserName(String newName, String id) {
		// TODO Auto-generated method stub
		UserBasePojo userBasePojo = new UserBasePojo();
		
		userBasePojo.setUserName(newName);
		
		userBasePojo.setUserId(id);
		
		int rows = personalCenterMapper.updatePetName(userBasePojo);
		
		if (rows > 0) {
			
			return rows;
		}
		return rows;
	}
	/**
	 * 修改头像
	 */
	@Override
	public int modifyUserHeadNumber(String userId) {
		// TODO Auto-generated method stub
		int num = personalCenterMapper.updateHead(userId);
		
		if (num > 0) {
			return num;
		}
		return num;
	}
	/**
	 * 奖品列表
	 * @param userId
	 * @return
	 */
	@Override
	public List<UserAwardRecords1Vo> prizeList(String userId) {
		Map<String, String> map = new HashMap<>();
		String table = TablesUtils.segmentation(userId, DbConstants.USER_AWARD_RECORDS);
		map.put("tableName", table);
		map.put("userId", "'" + userId + "'");

		List<UserAwardRecords1Vo> userAwardRecords = personalCenterMapper.queryUserPrizes(map);
		return userAwardRecords;
	}

	/**
	 * 个人信息追加
	 * @param vo
	 * @return
	 */
	@Override
	public AppResponseBody addUserInfo(AddUserInfoInputVo vo) {

		AppResponseBody app = new AppResponseBody();

		// 1、判断该用户是否已经
		// 根据第三方登录ID获取用户登录表的用户ID
		int id = personalCenterMapper.queryUserIdByLoginId(vo.getLoginUserId());
		if (id != 0) {
			// 有用户ID
			app.setData(id);
			app.setRetnCode(200);
			app.setRetnDesc("OK");
		} else {
			// 无用户ID，追加用户登录信息
			UserLoginPojo userLoginPojo = new UserLoginPojo();
			userLoginPojo.setLoginId(vo.getLoginUserId());
			userLoginPojo.setUserTel(vo.getUserTel());
			int row1 = personalCenterMapper.insertUserLoginInfo(userLoginPojo);

			// 获取生成的用户ID
			String userId = String.valueOf(userLoginPojo.getId());

			// 追加个人资料表信息
			UserBasePojo userBasePojo = new UserBasePojo();

			String inviteCode = CodeRuleUtils.inviteCode(userId);

			userBasePojo.setUserId(userId);
			userBasePojo.setUserName(vo.getLoginUserName());
			userBasePojo.setPortraitNum(1);
			userBasePojo.setExperience(0);
			userBasePojo.setGold(0);
			userBasePojo.setRedPacketValue(20);
			userBasePojo.setUserPoint(0);
			userBasePojo.setInviteCode(inviteCode);
			userBasePojo.setExchangeCode("");
			userBasePojo.setUserLoginChannel("H5");
			userBasePojo.setUserPayFlag(0);
			userBasePojo.setEffective(1);
			userBasePojo.setPasswd("");
			int row2 = personalCenterMapper.insertUserBaseInfo(userBasePojo);

			if (row1 > 0 && row2 > 0) {
				app.setData(userId);
				app.setRetnCode(200);
				app.setRetnDesc("OK");
			} else {
				app.setRetnCode(000);
				app.setRetnDesc("NG");
			}
		}
		return app;
	}
}
