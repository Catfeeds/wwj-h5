package com.zww.callback.service;

import com.zww.callback.pojo.StreamCloseInfoPojo;
import com.zww.callback.pojo.StreamCreateInfoPojo;

/**
 * 即构回调接口Service类
 *
 * @author kuang
 * @since 2018.02.07
 * @version 1.0
 */
public interface WwjliveService {

    /**
     * 流创建回调接口
     * @param pojo
     * @return
     */
    int insertStreamCreateInfo(StreamCreateInfoPojo pojo);

    /**
     * 流关闭回调接口
     * @param pojo
     * @return
     */
    int insertStreamCloseInfo(StreamCloseInfoPojo pojo);
}
