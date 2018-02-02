package com.zww.encode.controller;

import com.alibaba.fastjson.JSONObject;
import com.zww.constants.SignConstants;
import com.zww.encode.vo.ResultDecodeInputVo;
import com.zww.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 游戏结果校验处理
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
@Controller
@RequestMapping("/encode")
public class ResultDecodeController {

    @ResponseBody
    @RequestMapping(value = "/resultDecode", method = RequestMethod.POST)
    public AppResponseBody resultDecode(@RequestBody ResultDecodeInputVo inputVo) {

        AppResponseBody app = new AppResponseBody();
        if (inputVo == null) {
            app.setRetnCode(000);
            app.setRetnDesc("校验游戏结果失败");
            return app;
        }

        // 明文:
        JSONObject objectPt = new JSONObject(true);
        objectPt.put("session_id", inputVo.getSessionId());
        objectPt.put("result", inputVo.getResult());
        JSONObject objectPlayer = new JSONObject(true);
        objectPlayer.put("id", inputVo.getId());
        objectPlayer.put("name", inputVo.getName());
        objectPt.put("player", objectPlayer);
        // 获取鉴权信息并设置
        UserQueueStatus status = SignConstants.getPlaying().get(inputVo.getRoomId());
        String userId = inputVo.getId() == null ? "" : inputVo.getId();
        if (status != null && userId.equals(status.getUserId())) {
            objectPt.put("custom_token", status.getCustomToken());
        } else {
            objectPt.put("custom_token", EncodeUtils.getBase64(SignConstants.SERVERSECRECT));
        }
        objectPt.put("time_stamp", inputVo.getTimeStamp());
        String plaintext = objectPt.toString();

        // 解密操作
        byte[] resultByte;
        String decodeResult = null;
        try {
            resultByte = AESUtil.decrypt(inputVo.getEncryptedResult(), SignConstants.SERVERSECRECT.getBytes("UTF-8"));
            decodeResult = new String(resultByte, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 结果校验
        if (decodeResult.equals(plaintext)) {
            app.setRetnCode(200);
            app.setRetnDesc("校验游戏结果成功");
        } else {
            app.setRetnCode(000);
            app.setRetnDesc("校验游戏结果失败");
        }

        return app;
    }
}
