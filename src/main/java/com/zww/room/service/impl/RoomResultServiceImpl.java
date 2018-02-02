package com.zww.room.service.impl;

import com.zww.constants.DbConstants;
import com.zww.constants.SignConstants;
import com.zww.encode.vo.ResultDecodeInputVo;
import com.zww.manage.pojo.FinalResultPojo;
import com.zww.manage.service.ConnectService;
import com.zww.room.repository.RoomResultMapper;
import com.zww.room.service.RoomResultService;
import com.zww.util.TablesUtils;
import com.zww.util.UserQueueStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 游戏结果处理service实现类
 *
 * @author kuang
 * @since 2018.02.02
 * @version 1.0
 */
@Service
public class RoomResultServiceImpl implements RoomResultService {

    @Autowired
    private RoomResultMapper roomResultMapper;

    @Autowired
    private ConnectService connectService;

    /**
     * 游戏结果处理
     * @param inputVo
     * @return
     */
    @Override
    public boolean roomResultHandle(ResultDecodeInputVo inputVo) {

        boolean resultFlag = false;

        // 更新抓取记录表
        FinalResultPojo pojo = new FinalResultPojo();
        pojo.setFinalResult(String.valueOf(inputVo.getResult()));

        // 从正在玩玩家队列中获取抓取记录信息
        UserQueueStatus status = SignConstants.getPlaying().get(inputVo.getRoomId());

        pojo.setId(status != null ? status.getId() : "");
        pojo.setTableName(TablesUtils.segmentation(
                inputVo.getId(), DbConstants.USER_GRAB_RECORDS));
        int row = roomResultMapper.updateUserOperationRecords(pojo);

        // 插入用户、机器的获奖记录
        if (row == 1) {
            resultFlag = connectService.updateAwardRecords(inputVo.getId(),
                            inputVo.getRoomId(), String.valueOf(inputVo.getResult()));
        }
        return resultFlag;
    }
}
