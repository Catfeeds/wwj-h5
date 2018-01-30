package com.zww.encode.controller;

import com.alibaba.fastjson.JSONObject;
import com.zww.constants.SignConstants;
import com.zww.encode.vo.LoginTokenInputVo;
import com.zww.util.EncodeUtils;
import com.zww.util.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * LoginToken接口页面处理类
 *
 * @author kuang
 * @since 2018.01.23
 * @version 1.0
 */
@Controller
@RequestMapping("/encode")
public class LoginTokenController {

    @ResponseBody
    @RequestMapping(value = "/loginToken", method = RequestMethod.POST)
    public String loginToken(@RequestBody LoginTokenInputVo loginTokenInputVo) {

        String appKey = SignConstants.APP_KEY;

        // 参数
        String app_id = SignConstants.APP_ID;
        String app_key_32 = appKey.replaceAll("0x", "").replaceAll(",", "").substring(0, 32);
        String id_name = loginTokenInputVo.getIdName();
        String nonce = UUIDUtil.getUUID();
        String expired = String.valueOf(SignConstants.End_LIVE_TIME);

        // hash生成
        String hash = EncodeUtils.getMD5(app_id + app_key_32 + id_name + nonce + expired);

        // base64加密前json生成
        JSONObject json = new JSONObject(true);
        json.put("ver", SignConstants.VER);
        json.put("hash", hash);
        json.put("nonce", nonce);
        json.put("expired", SignConstants.End_LIVE_TIME);

        // base64加密
        String str = json.toString();

        return EncodeUtils.getBase64(str);
    }
}
