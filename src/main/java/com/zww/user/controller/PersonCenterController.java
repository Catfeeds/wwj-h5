package com.zww.user.controller;

import com.zww.user.service.PersonalCenterService;
import com.zww.user.vo.*;
import com.zww.util.AppResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Cynthia on 2018/1/24.
 */
@RequestMapping("/user")
@Controller
public class PersonCenterController {
    @Autowired
    private PersonalCenterService personalCenterService;
    /**
     * 修改昵称
     *
     * @param paramVo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public AppResponseBody personalCenterRename(@RequestBody ParamVo paramVo,
                                                HttpServletRequest request ) {

        int rows = personalCenterService.modifyUserName(paramVo.getNewName(), paramVo.getUserId());
        AppResponseBody app = new AppResponseBody();

        if (rows != 0) {
            app.setRetnCode(200);
            app.setRetnDesc("OK");
            return app;
        }else {
            app.setRetnCode(200);
            app.setRetnDesc("修改失败!");
            return app;
        }
    }
    /**
     * 个人中心展示
     *
     * @param paramVo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/showUser", method = RequestMethod.POST)
    public AppResponseBody personalCenterShow(@RequestBody UserBaseVo paramVo,
                                                HttpServletRequest request ) {
        UserBaseVo userBase = personalCenterService.showUserInfo(paramVo.getUserId());

        AppResponseBody app = new AppResponseBody();

        app.setData(userBase);
        app.setRetnCode(200);
        app.setRetnDesc("OK");

        return app;
    }
    /**
     * 中奖列表
     *
     * @param paramVo
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/showUserAwardInfo", method = RequestMethod.POST)
    public AppResponseBody prizeList(@RequestBody ParamVo paramVo ,HttpServletRequest request){

        List<UserAwardRecordsVo> userAwardRecords1s = personalCenterService.prizeList(paramVo.getUserId());

        AppResponseBody app = new AppResponseBody();

        app.setData(userAwardRecords1s);
        app.setRetnCode(200);
        app.setRetnDesc("OK");

        return app;

    }

    /**
     * 个人信息追加
     * @param vo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    public AppResponseBody addUserInfo(@RequestBody AddUserInfoInputVo vo) {
        AppResponseBody app = personalCenterService.addUserInfo(vo);

        return app;
    }

    /**
     * 获取用户获奖记录状态
     * @param param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserAwardStatus", method = RequestMethod.POST)
    public AppResponseBody getUserAwardStatus(@RequestBody ShowUserAwardStatusInputVo param) {
        AppResponseBody app = new AppResponseBody();
        if (param != null) {
            int userId = param.getUserId();
            int id = param.getId();
            ShowUserAwardStatusOutputVo data = personalCenterService.getUserAwardStatus(userId, id);
            app.setData(data);
            app.setRetnCode(200);
            app.setRetnDesc("OK");
        } else {
            app.setRetnCode(000);
            app.setRetnDesc("输入参数错误！");
        }
        return app;
    }
}
