package com.zww.manage.controller;


import com.zww.manage.service.ConnectService;
import com.zww.manage.vo.AwardRecordsVo;
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
    /**
     * 更新抓取记录
     *
     * @param paramVo
     * @param request
     * @return
     */
    @Autowired
    private ConnectService connectService;
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
}
