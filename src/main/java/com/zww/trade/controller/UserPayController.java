package com.zww.trade.controller;

import com.zww.trade.service.UserPayService;
import com.zww.trade.vo.UserPayInputVo;
import com.zww.util.AppResponseBody;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户支付功能
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
@Controller
@RequestMapping("/pay")
public class UserPayController {

    @Autowired
    private UserPayService userPayService;

    /**
     * 用户支付处理
     * @param vo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userPay", method = RequestMethod.POST)
    public AppResponseBody userPayHandle(@RequestBody UserPayInputVo vo) {

        AppResponseBody app = new AppResponseBody();

        if (StringUtils.isEmpty(vo.getUserId()) || StringUtils.isEmpty(vo.getRoomId())) {
            app.setRetnCode(000);
            app.setRetnDesc("网络故障，请稍后再试！");
        } else {
            app = userPayService.userPayHandle(vo);
        }

        return app;
    }
}
