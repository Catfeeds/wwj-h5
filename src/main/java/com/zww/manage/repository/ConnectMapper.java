package com.zww.manage.repository;

import com.zww.manage.pojo.AwardRecordsPojo;
import com.zww.manage.pojo.FinalResultPojo;
import org.springframework.stereotype.Component;

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
	
}
