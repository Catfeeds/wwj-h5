package com.zww.manage.service;

import com.zww.manage.vo.AwardRecordsVo;
import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecords1Vo;

/**
 * Created by Cynthia on 2018/1/25.
 */
public interface ConnectService {

    /**
     * 更新用户获奖记录
     * @param userid
     * @param macid
     */
    public boolean updateAwardRecords(String userid, String macid, String is);

    /**
     * 奖品订单信息填写
     * @param prizeId
     * @param userId
     * @param consignee
     * @param telephone
     * @param address
     * @param message
     * @return
     */
    ParamVo inputPrizeOrder(UserAwardRecords1Vo vo);
}
