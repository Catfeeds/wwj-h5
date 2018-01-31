package com.zww.trade.controller;

import com.zww.trade.service.PointExchangeService;
import com.zww.trade.vo.PointExchangeHandleInputVo;
import com.zww.trade.vo.PointExchangeHandleOutputVo;
import com.zww.trade.vo.PointExchangeRecordsOutputVo;
import com.zww.trade.vo.PointHomePageOutputVo;
import com.zww.util.AppResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户积分兑换功能
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
@Controller
@RequestMapping("/point")
public class PointExchangeController {

    @Autowired
    private PointExchangeService pointExchangeService;

    /**
     * 积分兑换首页展示
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/pointHomePage", method = RequestMethod.POST)
    public PointHomePageOutputVo pointHomePage(@RequestBody String userId) {
        PointHomePageOutputVo outputVo = pointExchangeService.pointHomePage(userId);
        return outputVo;
    }

    /**
     * 积分兑换处理
     * @param param
     */
    @ResponseBody
    @RequestMapping(value = "/pointExchange", method = RequestMethod.POST)
    public PointExchangeHandleOutputVo pointExchangeHandle(@RequestBody PointExchangeHandleInputVo param) {
        PointExchangeHandleOutputVo outputVo = pointExchangeService.pointExchangeHandle(param);
        return outputVo;
    }

    /**
     * 用户积分兑换账单展示
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserPointExchangeRecords", method = RequestMethod.POST)
    public AppResponseBody getUserPointExchangeRecords(@RequestBody String userId) {
        List<PointExchangeRecordsOutputVo> data = pointExchangeService.queryUserRechargeRecords(userId);

        AppResponseBody app = new AppResponseBody();
        app.setData(data);
        app.setRetnCode(200);
        app.setRetnDesc("OK");
        return app;
    }
}
