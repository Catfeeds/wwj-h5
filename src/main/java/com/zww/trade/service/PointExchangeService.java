package com.zww.trade.service;

import com.zww.trade.vo.PointExchangeHandleInputVo;
import com.zww.trade.vo.PointExchangeHandleOutputVo;
import com.zww.trade.vo.PointHomePageOutputVo;

/**
 * 用户积分兑换功能Service
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public interface PointExchangeService {

	/**
	 * 积分兑换首页展示
	 * @param userId
	 * @return
	 */
	PointHomePageOutputVo pointHomePage(String userId);

	/**
	 * 积分兑换处理
	 * @param param
	 * @return
	 */
	PointExchangeHandleOutputVo pointExchangeHandle(PointExchangeHandleInputVo param);
	
}
