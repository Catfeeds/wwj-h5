package com.zww.user.service;

import java.util.List;

import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecords1Vo;
import com.zww.user.vo.UserAwardRecords1Vo.prizeVo;

public interface PrizeService {
	/**
	 * 中奖列表
	 * @param userId
	 * @return
	 */
	public List<UserAwardRecords1Vo> prizeList(String userId);
	
	/**
	 * 奖品订单详情
	 * @param userId
	 * @param prizeId
	 * @return
	 */
	public List<prizeVo> toyDetails(String awardId);
	
	/**
	 * 奖品订单详情
	 * @param userId
	 * @param prizeId
	 * @return
	 */
	public List<prizeVo> toyDetails(String userId, String awardId);
	
//	/**
//	 * 兑换金币
//	 * @param userId
//	 * @param prizeId
//	 * @return
//	 */
//	public ParamVo exchange(String userId, String awardId);
	
	
	/**
	 * 奖品订单信息填写
	 * @param prizeId
	 * @param userId
	 * @param consignee
	 * @param telephone
	 * @param address
	 * @param message
	 * @return
	 */
	ParamVo inputPrizeOrder(UserAwardRecords1Vo vo);
}
