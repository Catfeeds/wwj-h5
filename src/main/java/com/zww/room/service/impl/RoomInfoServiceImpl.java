package com.zww.room.service.impl;

import com.zww.room.repository.RoomInfoMapper;
import com.zww.room.service.RoomInfoService;
import com.zww.room.vo.RoomDetailShowVo;
import com.zww.room.vo.RoomLatelyAwardRecordsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 房间相关信息展示Service实现类
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
@Service
public class RoomInfoServiceImpl implements RoomInfoService {

    /**
     * 房间相关信息展示Mapper
     */
    @Autowired
    private RoomInfoMapper roomInfoMapper;

    /**
     * 获取房间奖品详情
     * @param roomId
     * @return
     */
    @Override
    public RoomDetailShowVo getRoomDetailInfo(String roomId) {

        RoomDetailShowVo resultVo = roomInfoMapper.queryRoomDetailInfo(roomId);
        return resultVo;
    }

    /**
     * 获取该房间的最近抓中记录
     * @param roomId
     * @return
     */
    @Override
    public List<RoomLatelyAwardRecordsVo> getRoomLatelyAwardRecords(String roomId) {

        List<RoomLatelyAwardRecordsVo> resultVo = roomInfoMapper.getRoomLatelyAwardRecords(roomId);
        return resultVo;
    }
}
