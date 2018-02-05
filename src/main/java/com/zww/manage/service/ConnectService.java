package com.zww.manage.service;

import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecordsVo;

/**
 * Created by Cynthia on 2018/1/25.
 */
public interface ConnectService {

    /**
     * 插入用户机器中奖信息
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
    ParamVo inputPrizeOrder(UserAwardRecordsVo vo);
    /**
     * 发货订单信息填写
     * @param prizeId
     * @param userId
     * @param courierCompany
     * @param courierNumber
     * @return
     */
    ParamVo updateDeliverOrder(UserAwardRecordsVo vo);


    /**
     * 确认收货
     * @param prizeId
     * @param userId
     * @return
     */
    ParamVo confirmReceiving(UserAwardRecordsVo vo);
}
