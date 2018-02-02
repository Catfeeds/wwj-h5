package com.zww.encode.controller;

import com.alibaba.fastjson.JSONObject;
import com.zww.constants.SignConstants;
import com.zww.encode.pojo.RoomConfigInfoPojo;
import com.zww.encode.service.ConfigEncodeService;
import com.zww.encode.vo.ConfigEncodeInputVo;
import com.zww.util.AESUtil;
import com.zww.util.EncodeUtils;
import com.zww.util.UserQueueStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 生成config信息处理类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
@Controller
@RequestMapping("/encode")
public class ConfigEncodeController {

    @Autowired
    private ConfigEncodeService configEncodeService;

    @ResponseBody
    @RequestMapping(value = "/configEncode", method = RequestMethod.POST)
    public String configEncode(@RequestBody ConfigEncodeInputVo inputVo) {

        // 1、根据房间ID获取游戏配置信息
        RoomConfigInfoPojo roomConfigInfo = configEncodeService.getRoomConfigInfo(inputVo.getRoomId());
        int game_time = 30;
        int claw_power_grab = 67;
        int claw_power_up = 33;
        int claw_power_move = 21;
        int up_height = 7;
        if (roomConfigInfo != null) {
            game_time = roomConfigInfo.getGameTime();
            claw_power_grab = roomConfigInfo.getClawPowerGrab();
            claw_power_up = roomConfigInfo.getClawPowerUp();
            claw_power_move = roomConfigInfo.getClawPowerMove();
            up_height = roomConfigInfo.getUpHeight();
        }

        // 加密前的json内容处理
        JSONObject object = new JSONObject(true);

        // game_config
        JSONObject gameConfigObject = new JSONObject(true);
        gameConfigObject.put("game_time", game_time);
        gameConfigObject.put("claw_power_grab", claw_power_grab);
        gameConfigObject.put("claw_power_up", claw_power_up);
        gameConfigObject.put("claw_power_move", claw_power_move);
        gameConfigObject.put("up_height", up_height);

        // authority_info
        JSONObject authorityInfoObject = new JSONObject(true);
        authorityInfoObject.put("session_id", inputVo.getSessionId());
        authorityInfoObject.put("confirm", inputVo.getConfirm());
        authorityInfoObject.put("time_stamp", inputVo.getTimeStamp());
        // 获取鉴权信息并设置
        UserQueueStatus status = SignConstants.getPlaying().get(inputVo.getRoomId());
        String userId = inputVo.getUserId() == null ? "" : inputVo.getUserId();
        if (status != null && userId.equals(status.getUserId())) {
            authorityInfoObject.put("custom_token", status.getCustomToken());
        } else {
            authorityInfoObject.put("custom_token", EncodeUtils.getBase64(SignConstants.SERVERSECRECT));
        }

        // 组装最终的内容
        object.put("game_config", gameConfigObject);
        object.put("authority_info", authorityInfoObject);

        // 进行AES加密：
        byte[] resultByte = null;
        String result = null;
        try {
            resultByte = AESUtil.encrypt(object.toString(), SignConstants.SERVERSECRECT.getBytes("UTF-8"));
            result = new String(resultByte, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
