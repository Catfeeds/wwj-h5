package com.zww.user.controller;

import com.zww.constants.SignConstants;
import com.zww.user.vo.LoginTokenInputVo;
import com.zww.user.vo.LoginTokenOutputVo;
import com.zww.util.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.MessageDigest;

/**
 * LoginToken接口页面处理类
 *
 * @author kuang
 * @since 2018.01.23
 * @version 1.0
 */
@Controller
public class LoginTokenController {

    @ResponseBody
    @RequestMapping("/loginToken")
    public LoginTokenOutputVo loginToken(@RequestBody LoginTokenInputVo loginTokenInputVo) {

        String appKey = "0xac,0x71,0x8a,0x2a,0x91,0x1d,0x98,0x41,0x6b,0xaf,0x60,0x8f,0xa8,0x4d,0xf8,0x09,0x5c,0x7a,0xe6,0xcb,0x53,0xd6,0xc0,0xcb,0x4e,0xdd,0x5e,0x8b,0xab,0x3a,0x96,0xea";

        // 参数
        String app_id = "3412959418";
        String app_key_32 = appKey.replaceAll("0x", "").replaceAll(",", "").substring(0, 32);
        String id_name = loginTokenInputVo.getIdName();
        String nonce = UUIDUtil.getUUID();
        String expired = String.valueOf(SignConstants.End_LIVE_TIME);

        // 结果
        String hash = getMD5(app_id + app_key_32 + id_name + nonce + expired);

        LoginTokenOutputVo result = new LoginTokenOutputVo();
        result.setVer("1");
        result.setHash(hash);
        result.setNonce(nonce);
        result.setExpired(expired);

        return result;
    }

    //生成MD5
    public static String getMD5(String message) {
        String md5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");  // 创建一个md5算法对象
            byte[] messageByte = message.getBytes("UTF-8");
            byte[] md5Byte = md.digest(messageByte);              // 获得MD5字节数组,16*8=128位
            md5 = bytesToHex(md5Byte);                            // 转换为16进制字符串
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5;
    }

    // 二进制转十六进制
    public static String bytesToHex(byte[] bytes) {
        StringBuffer hexStr = new StringBuffer();
        int num;
        for (int i = 0; i < bytes.length; i++) {
            num = bytes[i];
            if(num < 0) {
                num += 256;
            }
            if(num < 16){
                hexStr.append("0");
            }
            hexStr.append(Integer.toHexString(num));
        }
        return hexStr.toString().toUpperCase();
    }
}
