package com.zww.timer;

import com.zww.constants.SignConstants;
import com.zww.room.repository.HomePageMapper;
import com.zww.room.vo.MachineVo;
import com.zww.util.UserQueueStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 定时器任务
 *
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
@Component
public class Timer {

	@Autowired
	private HomePageMapper homePageMapper;

    /**
     * 每5秒执行一次，查询房间一览信息
     */
	@Scheduled(cron = "0/5 * *  * * ? ")
	public void timerTask() {
		
		List<MachineVo> list = homePageMapper.queryMachineList();

		Map<String, String> countMap = SignConstants.getRoomUserCount();

		for (MachineVo vo : list) {
			// 房间人数设置
			if (countMap.get(vo.getRoomId()) == null) {
				vo.setTotal(0);
//				vo.setMachineStatus("0");// TODO:test,error
			} else {
				vo.setTotal(Integer.valueOf(countMap.get(vo.getRoomId())));
//				vo.setMachineStatus("0");// TODO:test,error
			}
			// 房间状态设置
			UserQueueStatus userQueueStatus = SignConstants.getPlaying().get(vo.getRoomId());
			if (userQueueStatus == null) {
				vo.setMachineStatus("0");
			} else {
				vo.setMachineStatus("1");
			}
		}
		
		SignConstants.MACHINE_INFO_LIST = list;
	}
}
