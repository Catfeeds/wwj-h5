package com.zww.manage.service.impl;

import com.zww.constants.DbConstants;
import com.zww.manage.pojo.AwardRecordsPojo;

import com.zww.manage.repository.ConnectMapper;
import com.zww.manage.service.ConnectService;
import com.zww.user.vo.ParamVo;
import com.zww.user.vo.UserAwardRecords1Vo;
import com.zww.util.TablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 2018/1/25.
 */
@Service
public class ConnectServiceImpl implements ConnectService {
    @Autowired
    private ConnectMapper connectMapper;

    /**
     * 插入用户机器中奖信息
     */
    @Override
    public boolean updateAwardRecords(String userid, String macid, String is) {
        int result=0;
        if ("1".equals(is)) {
            AwardRecordsPojo awardRecordsPojo = new AwardRecordsPojo();
            awardRecordsPojo.setMacId(macid);
            awardRecordsPojo.setUserId(userid);
            awardRecordsPojo.setMacTableName(TablesUtils.segmentation(
                    macid, DbConstants.MACHINE_AWARD_RECORDS));
            awardRecordsPojo.setUserTableName(TablesUtils.segmentation(
                    userid, DbConstants.USER_AWARD_RECORDS));

            // 更新机器获奖记录表
            result = connectMapper.insertMachineAwardRecords(awardRecordsPojo);
            // 更新用户获奖记录表
            result += connectMapper.insertUserAwardRecords(awardRecordsPojo);

        }
        return result != 2 ? false : true;
    }
    /**
     * 申请发货
     */
    @Override
    public ParamVo inputPrizeOrder(UserAwardRecords1Vo vo) {

        Map<String, Object> map = new HashMap<>();

        String table = TablesUtils.segmentation(vo.getUserId(), DbConstants.USER_AWARD_RECORDS);
        map.put("tableName", table);
        map.put("prizeId", vo.getPrizeId());
        map.put("userId", vo.getUserId());
        map.put("consignee", vo.getConsignee());
        map.put("telephone", vo.getTelephone());
        map.put("address", vo.getAddress());
        map.put("message", vo.getMessage());
        map.put("id", vo.getAwardId());
        int rows = connectMapper.updatePrizeOrder(map);

        ParamVo paramVo = new ParamVo();

        if (rows > 0) {
            paramVo.setSign("0");
            paramVo.setReason("申请发货成功!");
        }else {
            paramVo.setSign("1");
            paramVo.setReason("申请发货失败!");
        }
        return paramVo;
    }
    /**
     * 发货
     */
    @Override
    public ParamVo updateDeliverOrder(UserAwardRecords1Vo vo) {
        Map<String, Object> map = new HashMap<>();

        String table = TablesUtils.segmentation(vo.getUserId(), DbConstants.USER_AWARD_RECORDS);
        map.put("tableName", table);
        map.put("userId", vo.getUserId());
        map.put("courierCompany",vo.getCourierCompany());
        map.put("courierNumber", vo.getCourierNumber());
        map.put("id", vo.getAwardId());
        int rows = connectMapper.updateDeliverOrder(map);

        ParamVo paramVo = new ParamVo();

        if (rows > 0) {
            paramVo.setSign("0");
            paramVo.setReason("发货成功");
        }else {
            paramVo.setSign("1");
            paramVo.setReason("发货失败!");
        }
        return paramVo;
    }
    /**
     * 确认收货
     */
    @Override
    public ParamVo confirmReceiving(UserAwardRecords1Vo vo) {
        Map<String, Object> map = new HashMap<>();

        String table = TablesUtils.segmentation(vo.getUserId(), DbConstants.USER_AWARD_RECORDS);
        map.put("tableName", table);
        map.put("userId", vo.getUserId());
        map.put("id", vo.getAwardId());
        int rows = connectMapper.confirmReceiving(map);

        ParamVo paramVo = new ParamVo();

        if (rows > 0) {
            paramVo.setSign("0");
            paramVo.setReason("确认收货成功");
        }else {
            paramVo.setSign("1");
            paramVo.setReason("确认收货失败!");
        }
        return paramVo;
    }

}