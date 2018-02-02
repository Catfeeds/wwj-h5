package com.zww.room.repository;

import com.zww.manage.pojo.FinalResultPojo;
import org.springframework.stereotype.Component;

/**
 * 游戏结果处理Mapper
 *
 * @author kuang
 * @since 2018.02.02
 * @version 1.0
 */
@Component
public interface RoomResultMapper {

    /**
     * 更新抓取记录表
     * @param pojo
     * @return
     */
    int updateUserOperationRecords(FinalResultPojo pojo);
}
