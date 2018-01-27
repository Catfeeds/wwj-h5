package com.zww.room.service;

import com.zww.room.vo.RoomDetailShowVo;
import com.zww.room.vo.RoomLatelyAwardRecordsVo;

import java.util.List;

/**
 * 房间相关信息展示Service
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
public interface RoomInfoService {

    /**
     * 获取房间奖品详情
     * @param roomId
     * @return
     */
    RoomDetailShowVo getRoomDetailInfo(String roomId);

    /**
     * 获取该房间的最近抓中记录
     * @param roomId
     * @return
     */
    List<RoomLatelyAwardRecordsVo> getRoomLatelyAwardRecords(String roomId);
}
