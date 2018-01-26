package com.zww.manage.repository;

import com.zww.manage.pojo.AwardRecordsPojo;
import com.zww.manage.pojo.FinalResultPojo;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface ConnectMapper {

	
	/**
	 * 插入用户获奖记录表
	 * @param pojo
	 * @return
	 */
	public int insertUserAwardRecords(AwardRecordsPojo pojo);
	
	/**
	 * 插入机器获奖记录表
	 * @param pojo
	 * @return
	 */
	public int insertMachineAwardRecords(AwardRecordsPojo pojo);

	/**
	 * 奖品订单信息填写
	 * @param map
	 * @return
	 */
	public int updatePrizeOrder(Map<String, Object> map);
	/**
	 *发货订单
	 * @param map
	 * @return
	 */
	public int updateDeliverOrder(Map<String, Object> map);
	/**
	 *确认收货
	 * @param map
	 * @return
	 */
	public int confirmReceiving(Map<String, Object> map);
	
}
