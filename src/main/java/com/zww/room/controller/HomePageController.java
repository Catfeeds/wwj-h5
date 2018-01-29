package com.zww.room.controller;

import com.zww.room.service.HomePageService;
import com.zww.room.vo.MachineVo;
import com.zww.util.AppResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 主页面展示
 * 
 * @author kuang
 * @since 2018.01.22
 * @version 1.0
 */
@Controller
@RequestMapping("/homePage")
public class HomePageController {
	
	@Autowired
	private HomePageService homePageService;

	/**
	 * 主页面展示
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public AppResponseBody show(){

		// 获取房间一览信息
		List<MachineVo> machineVos = homePageService.show();

		AppResponseBody app = new AppResponseBody();
		app.setData(machineVos);
		app.setRetnCode(200);
		app.setRetnDesc("OK");
		return app;
			
	}
	
}
