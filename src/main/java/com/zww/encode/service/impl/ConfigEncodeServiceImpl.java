package com.zww.encode.service.impl;

import com.zww.encode.pojo.RoomConfigInfoPojo;
import com.zww.encode.repository.ConfigEncodeMapper;
import com.zww.encode.service.ConfigEncodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 生成config信息Service实现类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
@Service
public class ConfigEncodeServiceImpl implements ConfigEncodeService {

    @Autowired
    private ConfigEncodeMapper configEncodeMapper;

    /**
     * 获取房间配置信息
     * @param roomId
     * @return
     */
    @Override
    public RoomConfigInfoPojo getRoomConfigInfo(String roomId) {

        RoomConfigInfoPojo roomConfigInfo = configEncodeMapper.getRoomConfigInfo(roomId);
        return roomConfigInfo;
    }

}