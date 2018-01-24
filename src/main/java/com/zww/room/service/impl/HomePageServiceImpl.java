package com.zww.room.service.impl;

import com.zww.constants.SignConstants;
import com.zww.room.service.HomePageService;
import com.zww.room.vo.MachineVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 主页面展示Service实现
 *
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
@Service
public class HomePageServiceImpl implements HomePageService {

    /**
     * 主页面展示
     * @return
     */
	@Override
	public List<MachineVo> show() {
		
		List<MachineVo> machineInfos = SignConstants.MACHINE_INFO_LIST;
		
		return machineInfos;
	}

}
