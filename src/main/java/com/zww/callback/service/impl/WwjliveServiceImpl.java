package com.zww.callback.service.impl;

import com.zww.callback.pojo.StreamCloseInfoPojo;
import com.zww.callback.pojo.StreamCreateInfoPojo;
import com.zww.callback.repository.WwjliveMapper;
import com.zww.callback.service.WwjliveService;
import com.zww.constants.SignConstants;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 即构回调接口Service实现类
 *
 * @author kuang
 * @since 2018.02.07
 * @version 1.0
 */
@Service
public class WwjliveServiceImpl implements WwjliveService {

    @Autowired
    private WwjliveMapper wwjliveMapper;

    /**
     * 流创建回调接口
     * @param pojo
     * @return
     */
    @Override
    public int insertStreamCreateInfo(StreamCreateInfoPojo pojo) {
        String timestamp = Long.toString(pojo.getTimestamp_zego());
        String nonce = pojo.getNonce();
        String signature = pojo.getSignature();
        Map<String, String> param = new HashMap<>();
        param.put("timestamp", timestamp);
        param.put("nonce", nonce);
        param.put("signature", signature);
        if (checkInfo(param)) {
            // 检验成功就插入数据
            return wwjliveMapper.insertStreamCreateInfo(pojo);
        }
        return 0;
    }

    /**
     * 流关闭回调接口
     * @param pojo
     * @return
     */
    @Override
    public int insertStreamCloseInfo(StreamCloseInfoPojo pojo) {
        String timestamp = Long.toString(pojo.getTimestamp_zego());
        String nonce = pojo.getNonce();
        String signature = pojo.getSignature();
        Map<String, String> param = new HashMap<>();
        param.put("timestamp", timestamp);
        param.put("nonce", nonce);
        param.put("signature", signature);
        if (checkInfo(param)) {
            // 检验成功就插入数据
            return wwjliveMapper.insertStreamCloseInfo(pojo);
        }
        return 0;
    }

    // 数据检验
    private boolean checkInfo(Map<String, String> param) {
        String[] args = {param.get("timestamp"), param.get("nonce"), SignConstants.SERVERSECRECT};
        Arrays.sort(args);
        StringBuffer sb = new StringBuffer();
        for (String s : args) {
            sb.append(s);
        }
        String targer = DigestUtils.sha1Hex(sb.toString());
        String source = param.get("signature");
        if (source.equals(targer)) {
            return true;
        }
        return false;
    }
}
