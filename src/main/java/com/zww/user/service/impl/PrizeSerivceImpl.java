package com.zww.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zww.user.repository.PrizeMapper;
import org.springframework.stereotype.Service;

import com.zww.constants.DbConstants;
import com.zww.constants.SignConstants;
import com.zww.user.pojo.UserBasePojo;
import com.zww.user.service.PrizeService;
import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecords1Vo;
import com.zww.user.vo.UserAwardRecords1Vo.prizeVo;
import com.zww.util.TablesUtils;
import com.zww.util.UUIDUtil;


@Service
public class PrizeSerivceImpl implements PrizeService{
	@Resource
	private PrizeMapper prizeMapper;
	
//	@Resource
//	private ShortMessageService shortMessageService;
	
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
		
		List<UserAwardRecords1Vo> userAwardRecords1s = prizeMapper.queryUserPrizes(map);
		return userAwardRecords1s;
	}

	/**
	 * **************前期bug 后期作废******************
	 * 奖品订单详情
	 * @param userId
	 * @param prizeId
	 * @return
	 */
	@Override
	public List<prizeVo> toyDetails(String awardId) {
		
		Map<String, String> map = new HashMap<>();
		String table = TablesUtils.segmentation(awardId, DbConstants.USER_AWARD_RECORDS);
		map.put("tableName", table);
		map.put("id", awardId);  
		
		List<UserAwardRecords1Vo> userAwardRecords1s = prizeMapper.queryUserPrizeDetails(map);
		
		UserAwardRecords1Vo vo = userAwardRecords1s.get(0);
		
		List<prizeVo> maps = UserAwardRecords1Vo.voToList(vo);
		return maps;
	}

	/**
	 * 奖品订单详情
	 * @param userId
	 * @param prizeId
	 * @return
	 */
	public List<prizeVo> toyDetails(String userId, String awardId){
		Map<String, String> map = new HashMap<>();
		String table = TablesUtils.segmentation(userId, DbConstants.USER_AWARD_RECORDS);
		map.put("tableName", table);
		map.put("id", awardId);  
		
		List<UserAwardRecords1Vo> userAwardRecords1s = prizeMapper.queryUserPrizeDetails(map);
		
		UserAwardRecords1Vo vo = userAwardRecords1s.get(0);
		
		List<prizeVo> maps = UserAwardRecords1Vo.voToList(vo);
		return maps;
	}
	
//	/**
//	 * 兑换金币
//	 */
//	@Override
//	public ParamVo exchange(String userId, String awardId) {
//
//		ParamVo paramVo  = new ParamVo();
//
//		Map<String, Object> map1 = new HashMap<>();
//		String table = TablesUtils.segmentation(userId, DbConstants.USER_AWARD_RECORDS);
//		map1.put("tableName", table);
//		map1.put("awardId", "'" + awardId + "'");
//
//		UserAwardRecords1Vo vo = prizeMapper.queryExchangeById(map1);
//
//		String status = vo.getPrizeStatus();
//
//		//寄存中状态
//		if (SignConstants.SIGN_PLUS_ONE.equals(status)) {
//
//			int addGolds = vo.getValue();
//
//			UserBasePojo userBasePojo = new UserBasePojo();
//			userBasePojo.setGold(addGolds);
//			userBasePojo.setUserId(userId);
//
//			int rows1 = prizeMapper.updateGoldsByUserId(userBasePojo);
//
//			Map<String, String> map = new HashMap<>();
//			String table1 = TablesUtils.segmentation(userId, DbConstants.USER_AWARD_RECORDS);
//			map.put("tableName", table1);
//			map.put("awardId", awardId);
//
//			int rows2 = prizeMapper.updateStatusAfterExchange(map);
//
//			UserRechargeRecords1Pojo pojo = new UserRechargeRecords1Pojo();
//
//			pojo.setTableName(TablesUtils.segmentation(userId,
//					DbConstants.USER_RECHARGE_RECORDS));
//			pojo.setUserId(userId);
//			pojo.setAmt(addGolds);
//			pojo.setNumber(UUIDUtil.getUUID());
//			pojo.setOutNumber(UUIDUtil.getUUID());
//			pojo.setBillExplain(String.valueOf(addGolds));
//
//			int rows3 = prizeMapper.insertExchangeRecord(pojo);
//
//			if (rows1 != 0 && rows2 != 0 && rows3 > 0) {
//				paramVo.setValue(String.valueOf(addGolds));
//				paramVo.setSign("0");
//				paramVo.setReason("兑换成功!");
//			}
//			return paramVo;
//		}else {
//			paramVo.setValue("");
//			paramVo.setSign("1");
//			paramVo.setReason("兑换失败!");
//		}
//		return paramVo;
//	}
	
	

	/**
	 * 申请发货
	 */
	@Override
	public ParamVo inputPrizeOrder(UserAwardRecords1Vo vo) {
		
		Map<String, Object> map = new HashMap<>();
		
		String table = TablesUtils.segmentation(vo.getUserId(), DbConstants.USER_AWARD_RECORDS);
		map.put("tableName", table);
		map.put("prizeId", vo.getPrizeId());  
		map.put("userId", vo.getUserId());  
		map.put("consignee", vo.getConsignee());  
		map.put("telephone", vo.getTelephone());  
		map.put("address", vo.getAddress());  
		map.put("message", vo.getMessage());  
		map.put("id", vo.getAwardId());
		int rows = prizeMapper.updatePrizeOrder(map);
		
		ParamVo paramVo = new ParamVo();
		
//		if (rows > 0) {
//			paramVo.setSign("0");
//			paramVo.setReason("申请发货成功!");
//			String context = "您的幸运娃娃我们已经准备好，我们会火速发货，记得收获幸运哦~";
//			shortMessageService.sendSms(vo.getTelephone(), context);
//		}else {
//			paramVo.setSign("1");
//			paramVo.setReason("申请发货失败!");
//		}
		return paramVo;
	}
}
