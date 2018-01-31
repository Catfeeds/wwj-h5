package com.zww.trade.repository;

import com.zww.trade.pojo.GoldPackagePojo;
import com.zww.trade.pojo.UserRechargeRecordsPojo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 用户积分兑换功能Mapper
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
@Component
public interface PointExchangeMapper {

	/**
	 * 查询出积分兑换套餐列表
	 * 
	 * @return
	 */
	List<GoldPackagePojo> queryGoldPackageList();

	/**
	 * 更新用户积分值
	 * @param map
	 * @return
	 */
	int updateUserPoint(Map<String, String> map);

	/**
	 * 查询用户当前金币数
	 * @param userId
	 * @return
	 */
	int queryUserGold(String userId);

	/**
	 * 更新用户金币、积分值
	 * @param map
	 * @return
	 */
	int updateUserGoldAndPoint(Map<String, String> map);

	/**
	 * 增加兑换积分记录
	 * @param pojo
	 */
	int insertUserRechargeRecords(UserRechargeRecordsPojo pojo);
	
}
