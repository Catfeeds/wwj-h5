package com.zww.encode.service;

import com.zww.encode.pojo.RoomConfigInfoPojo;

/**
 * 生成config信息Service类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
public interface ConfigEncodeService {

    /**
     * 获取房间配置信息
     * @param roomId
     * @return
     */
    RoomConfigInfoPojo getRoomConfigInfo(String roomId);
}
