package com.zww.trade.service.impl;

import com.zww.constants.DbConstants;
import com.zww.constants.SignConstants;
import com.zww.trade.pojo.UserOperationRecordsPojo;
import com.zww.trade.repository.UserPayMapper;
import com.zww.trade.service.UserPayService;
import com.zww.trade.vo.UserPayInputVo;
import com.zww.user.pojo.UserBasePojo;
import com.zww.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Random;

/**
 * 用户支付功能Service实现类
 *
 * @author kuang
 * @since 2018.02.01
 * @version 1.0
 */
@Service
public class UserPayServiceImpl implements UserPayService {

    @Autowired
    private UserPayMapper userPayMapper;

    /**
     * 用户支付处理
     * @param vo
     * @return
     */
    @Override
    public AppResponseBody userPayHandle(UserPayInputVo vo) {

        AppResponseBody app = new AppResponseBody();

        // 1、根据用户ID查询金币数
        Integer golds = userPayMapper.queryGoldByUserId(vo.getUserId());
        int goldsInt = golds == null ? golds.intValue() : 0;

        // 2、根据房间ID查询游戏消耗
        Integer consume = userPayMapper.queryConsumeByRoomId(vo.getRoomId());
        int consumeInt = consume == null ? consume.intValue() : 0;

        // 3、判断用户金币是否满足该次游戏
        if (goldsInt != 0 && consumeInt <= goldsInt) {
            // 满足
            //金币扣除
            int minusGolds =(consumeInt > 0) ? -consumeInt : consumeInt;

            UserBasePojo userBasePojo = new UserBasePojo();
            userBasePojo.setGold(minusGolds);
            userBasePojo.setUserId(vo.getUserId());

            int row = userPayMapper.updateGoldsByUserId(userBasePojo);

            // 插入记录到【用户抓取记录】表
            int row1 = 0;
            String id = "";
            if (row == 1) {
                UserOperationRecordsPojo operationPojo = new UserOperationRecordsPojo();
                operationPojo.setMachineId(vo.getRoomId());
                operationPojo.setUserId(vo.getUserId());
                operationPojo.setSetResult(isHit());
                operationPojo.setPrizeId(vo.getPrizeId());
                operationPojo.setTableName(
                        TablesUtils.segmentation(vo.getUserId(), DbConstants.USER_GRAB_RECORDS));
                row1 = userPayMapper.insertUserOperationRecords(operationPojo);
                id = operationPojo.getId();
            }

            if (row != 1 || row1 != 1) {
                app.setRetnCode(000);
                app.setRetnDesc("支付失败，请稍后再试！");
                return app;
            }

            // 更新正在玩玩家队列
            LocalTime time = LocalTime.now();
            UserQueueStatus user = new UserQueueStatus(vo.getUserId(),"play",time);
            user.setId(id);
            // 生成鉴权信息custom_token
            user.setCustomToken(EncodeUtils.getBase64(UUIDUtil.getUUID()));
            SignConstants.getPlaying().put(vo.getRoomId(), user);

            app.setRetnCode(200);
            app.setRetnDesc("支付成功！");
        } else {
            // 不满足
            app.setRetnCode(000);
            app.setRetnDesc("金币不足，请去充值！");
        }
        return app;
    }

    /**
     * 产生设定结果
     * @return
     */
    private static int isHit(){

        Random random = new Random();
        int i = random.nextInt(2);

        return i;
    }
}
