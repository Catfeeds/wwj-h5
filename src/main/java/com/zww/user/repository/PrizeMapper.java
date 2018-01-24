package com.zww.user.repository;

import java.util.List;
import java.util.Map;

import com.zww.user.pojo.UserBasePojo;
import com.zww.user.vo.UserAwardRecords1Vo;

public interface PrizeMapper {
	/**
	 * 用户奖品列表
	 * @param map
	 * @return
	 */
	List<UserAwardRecords1Vo> queryUserPrizes(Map<String, String> map);
	
	
	/**
	 * 奖品订单详情
	 * @param map
	 * @return
	 */
	List<UserAwardRecords1Vo> queryUserPrizeDetails(Map<String, String> map);
	
	
	/**
	 * 奖品金币数
	 * @param map
	 * @return
	 */
	UserAwardRecords1Vo queryExchangeById(Map<String, Object> map);
	
	
	/**
	 * 更新用户金币
	 * @param userBasePojo
	 */
	public int updateGoldsByUserId(UserBasePojo userBasePojo);
	
	
	/**
	 * 礼物兑换金币
	 * @param map
	 * @return
	 */
	int updateStatusAfterExchange(Map<String, String> map);
	
	
	/**
	 * 奖品订单信息填写
	 * @param map
	 * @return
	 */
	int updatePrizeOrder(Map<String, Object> map);
	
	/**
	 * 根据用户id和奖品id查询奖品记录
	 * @param userBasePojo
	 * @return
	 */
	UserAwardRecords1Vo queryUserPrizeByUserId(UserBasePojo userBasePojo);
	
	/**
	 * 兑换奖品插入账单
	 * @param pojo
	 * @return
	 */
//	public int insertExchangeRecord(UserRechargeRecords1Pojo pojo);
}
