package com.zww.room.vo;

import com.zww.constants.SignConstants;
import com.zww.util.AppResponseBody;

/**
 * 主页面展示输出VO类
 *
 * @author kuang
 * @since 2018.02.02
 * @version 1.0
 */
public class HomePageOutputVo extends AppResponseBody {

    /**
     * app_id
     * @return
     */
    public String getAppId() {
        return SignConstants.APP_ID;
    }

    /**
     * server
     * @return
     */
    public String getServer() {
        return SignConstants.SERVER;
    }
}
