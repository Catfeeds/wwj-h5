package com.zww.room.repository;

import com.zww.room.vo.MachineVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 主页面展示Mapper
 *
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
@Component
public interface HomePageMapper {

	/**
	 * 查询当前可用的机器列表
	 * 
	 * @return
	 */
	public List<MachineVo> queryMachineList();
	
}
