package com.zww.trade.repository;

import com.zww.trade.pojo.UserOperationRecordsPojo;
import com.zww.user.pojo.UserBasePojo;
import com.zww.user.vo.PrizeVo;
import org.springframework.stereotype.Component;

/**
 * 用户支付功能Mapper类
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
@Component
public interface UserPayMapper {

    /**
     * 根据用户id查询用户金币
     *
     * @param userId
     * @return
     */
    int queryGoldByUserId(String userId);

    /**
     * 更新用户金币
     * @param userBasePojo
     * @return
     */
    int updateGoldsByUserId(UserBasePojo userBasePojo);

    /**
     * 根据房间id查询游戏消耗
     *
     * @param roomId
     * @return 游戏消耗
     */
    int queryConsumeByRoomId(String roomId);

    /**
     * 预设用户抓取表
     * @param pojo
     */
    int insertUserOperationRecords(UserOperationRecordsPojo pojo);
}
