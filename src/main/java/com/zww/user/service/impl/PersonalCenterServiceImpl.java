package com.zww.user.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.zww.constants.DbConstants;
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
	}
