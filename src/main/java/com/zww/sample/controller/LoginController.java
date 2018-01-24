package com.zww.sample.controller;

import com.zww.sample.service.LoginService;
import com.zww.sample.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录
 * @author john
 * @since 2017.10.10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	/**
	 * 登录
	 * 
	 * @param paramVo
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public LoginVo login(@RequestBody LoginVo paramVo,
			HttpServletRequest request ) {
		
		LoginVo vo = loginService.login(
				paramVo.getId(),
				paramVo.getTokenId(),
				paramVo.getWxopenId(),
				paramVo.getUnionId());

		return vo;
			
	}
	
	
}
