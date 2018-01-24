package com.zww.room.service;

import com.zww.room.vo.MachineVo;

import java.util.List;

/**
 * 主页面展示Service
 *
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
public interface HomePageService {

	/**
	 * 主页面展示
	 * @return
	 */
	public List<MachineVo> show();
	
}
