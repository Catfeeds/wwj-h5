package com.zww.room.repository;

import com.zww.room.vo.RoomDetailShowVo;
import com.zww.room.vo.RoomLatelyAwardRecordsVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 房间相关信息展示Mapper
 *
 * @author kuang
 * @since 2018.01.26
 * @version 1.0
 */
@Component
public interface RoomInfoMapper {

    /**
     * 查询房间详细信息
     * @param roomId
     * @return 房间详细信息
     */
    RoomDetailShowVo queryRoomDetailInfo(String roomId);

    /**
     * 获取该房间的最近抓中记录
     * @param roomId
     * @return
     */
    List<RoomLatelyAwardRecordsVo> getRoomLatelyAwardRecords(String roomId);
}
