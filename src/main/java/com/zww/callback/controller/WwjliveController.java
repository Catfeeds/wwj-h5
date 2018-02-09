package com.zww.callback.controller;

import com.zww.callback.pojo.StreamCloseInfoPojo;
import com.zww.callback.pojo.StreamCreateInfoPojo;
import com.zww.callback.service.WwjliveService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 即构回调接口
 *
 * @author kuang
 * @since 2018.02.06
 * @version 1.0
 */
@Controller
@RequestMapping("/wwjlive")
public class WwjliveController {

    @Autowired
    private WwjliveService wwjliveService;

    /**
     * 流创建回调接口
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public int create(@RequestParam("id") String id,
                      @RequestParam("live_id") String live_id,
                      @RequestParam("channel_id") String channel_id,
                      @RequestParam("title") String title,
                      @RequestParam("stream_alias") String stream_alias,
                      @RequestParam("publish_id") String publish_id,
                      @RequestParam("publish_name") String publish_name,
                      @RequestParam("rtmp_url[]") List<String> rtmp_url,
                      @RequestParam("hls_url[]") List<String> hls_url,
                      @RequestParam("hdl_url[]") List<String> hdl_url,
                      @RequestParam("pic_url[]") List<String> pic_url,
                      @RequestParam("create_time") String create_time,
                      @RequestParam("timestamp") String timestamp,
                      @RequestParam("nonce") String nonce,
                      @RequestParam("signature") String signature) {

        // 设置追加记录内容
        StreamCreateInfoPojo pojo = new StreamCreateInfoPojo();
        pojo.setZego_id(formatString(id));
        pojo.setLive_id(formatString(live_id));
        pojo.setChannel_id(channel_id);
        pojo.setTitle(title);
        pojo.setStream_alias(stream_alias);
        pojo.setPublish_id(publish_id);
        pojo.setPublish_name(publish_name);
        if (rtmp_url.size() >= 2) {
            pojo.setRtmp_url_0(rtmp_url.get(0));
            pojo.setRtmp_url_1(rtmp_url.get(1));
        }
        if (hls_url.size() >= 2) {
            pojo.setHls_url_0(hls_url.get(0));
            pojo.setHls_url_1(hls_url.get(1));
        }
        if (hdl_url.size() >= 2) {
            pojo.setHdl_url_0(hdl_url.get(0));
            pojo.setHdl_url_1(hdl_url.get(1));
        }
        if (pic_url.size() >= 1) {
            pojo.setPic_url_0(pic_url.get(0));
        }
        pojo.setCreate_time_zego(StringUtils.isEmpty(create_time) ? 0 : Long.valueOf(create_time));
        pojo.setTimestamp_zego(StringUtils.isEmpty(timestamp) ? 0 : Long.valueOf(timestamp));
        pojo.setNonce(nonce);
        pojo.setSignature(signature);

        // 调用追加记录方法
        return wwjliveService.insertStreamCreateInfo(pojo);
    }

    /**
     * 流关闭回调接口
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/close", method = RequestMethod.POST)
    public int close(@RequestParam("id") String id,
                     @RequestParam("type") String type,
                     @RequestParam("channel_id") String channel_id,
                     @RequestParam("stream_alias") String stream_alias,
                     @RequestParam("third_define_data") String third_define_data,
                     @RequestParam("timestamp") String timestamp,
                     @RequestParam("nonce") String nonce,
                     @RequestParam("signature") String signature) {

        // 设置追加记录内容
        StreamCloseInfoPojo pojo = new StreamCloseInfoPojo();
        pojo.setZego_id(formatString(id));
        pojo.setType(formatString(type));
        pojo.setChannel_id(channel_id);
        pojo.setStream_alias(stream_alias);
        pojo.setThird_define_data(third_define_data);
        pojo.setTimestamp_zego(StringUtils.isEmpty(timestamp) ? 0 : Long.valueOf(timestamp));
        pojo.setNonce(nonce);
        pojo.setSignature(signature);

        // 调用追加记录方法
        return wwjliveService.insertStreamCloseInfo(pojo);
    }

    /**
     * 格式化字符，把字符转换为整数
     * @param str
     * @return
     */
    private int formatString(String str) {
        return StringUtils.isEmpty(str) ? 0 : Integer.valueOf(str);
    }
}
