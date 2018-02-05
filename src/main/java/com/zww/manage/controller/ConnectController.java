package com.zww.manage.controller;


import com.zww.manage.service.ConnectService;
import com.zww.manage.vo.AwardRecordsVo;
import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecordsVo;
import com.zww.util.AppResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hp on 2018/1/25.
 */
@RequestMapping("/manage")
@Controller
public class ConnectController {

    @Autowired
    private ConnectService connectService;

    /**
     * 插入用户、机器的获奖记录
     *
     * @param paramVo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insertAwardRecords", method = RequestMethod.POST)
    public AppResponseBody updateAwardsRecords(@RequestBody AwardRecordsVo paramVo,
                                              HttpServletRequest request ) {

        boolean bool=connectService.updateAwardRecords(paramVo.getUserId(),paramVo.getMacId(),paramVo.getIs());

        AppResponseBody app = new AppResponseBody();

        if(bool) {
            app.setRetnCode(200);
            app.setRetnDesc("OK");
        }else{
            app.setRetnCode(000);
            app.setRetnDesc("error");
        }
        return app;
    }
    /**
     * 申请发货
     *
     * @param vo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delivery", method = RequestMethod.POST)
    public AppResponseBody delivery(@RequestBody UserAwardRecordsVo vo, HttpServletRequest request){

        ParamVo paramVo = connectService.inputPrizeOrder(vo);

        AppResponseBody app = new AppResponseBody();

        //app.setData(paramVo);
        app.setRetnCode(200);
        app.setRetnDesc("OK");

        return app;
    }
    /**
     * 发货
     *
     * @param vo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deliverPrizeHandle", method = RequestMethod.POST)
    public AppResponseBody deliveryOrder(@RequestBody UserAwardRecordsVo vo, HttpServletRequest request){


        ParamVo paramVo =connectService.updateDeliverOrder(vo);
        AppResponseBody app = new AppResponseBody();

        //app.setData(paramVo);
        app.setRetnCode(200);
        app.setRetnDesc("OK");

        return app;
    }


    /**
     *
     *确认收货
     * @param vo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userConfirmReceiving", method = RequestMethod.POST)
    public AppResponseBody confirmReceiving(@RequestBody UserAwardRecordsVo vo, HttpServletRequest request){


        ParamVo paramVo =connectService.confirmReceiving(vo);
        AppResponseBody app = new AppResponseBody();

       //app.setData(paramVo);
       app.setRetnCode(200);
       app.setRetnDesc("OK");

        return app;
    }

}
