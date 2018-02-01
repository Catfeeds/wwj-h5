package com.zww.trade.service.impl;

import com.zww.constants.DbConstants;
import com.zww.constants.PaymentConstants;
import com.zww.trade.pojo.GoldPackagePojo;
import com.zww.trade.pojo.UserRechargeRecordsPojo;
import com.zww.trade.repository.PointExchangeMapper;
import com.zww.trade.service.PointExchangeService;
import com.zww.trade.vo.PointExchangeHandleInputVo;
import com.zww.trade.vo.PointExchangeHandleOutputVo;
import com.zww.trade.vo.PointExchangeRecordsOutputVo;
import com.zww.trade.vo.PointHomePageOutputVo;
import com.zww.util.TablesUtils;
import com.zww.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户积分兑换功能Service实现类
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
@Service
public class PointExchangeServiceImpl implements PointExchangeService {

    @Autowired
    private PointExchangeMapper pointExchangeMapper;

    /**
     * 积分兑换首页展示
     * @param userId
     * @return
     */
    @Override
    public PointHomePageOutputVo pointHomePage(String userId) {

        PointHomePageOutputVo vo = new PointHomePageOutputVo();

        // 通过接口取得该用户的积分值
        int point = 5000;// TODO:test,需要用接口从第三方获得积分值

        // 把获取的积分值更新到表中
        Map<String, String> param = new HashMap<>();
        param.put("userId", userId);
        param.put("point", String.valueOf(point));
        int updateCount = pointExchangeMapper.updateUserPoint(param);
        if (updateCount != 1) {
            vo.setRetnCode(000);
            vo.setRetnDesc("更新积分信息失败，请稍后再试！");
            return vo;
        }

        // 查询出用户当前金币数
        int gold = pointExchangeMapper.queryUserGold(userId);

        // 查询出积分兑换套餐列表
        List<GoldPackagePojo> resultList = pointExchangeMapper.queryGoldPackageList();
        if (resultList != null && !resultList.isEmpty()) {
            vo.setData(resultList);
            vo.setPoint(point);
            vo.setGold(gold);
            vo.setRetnCode(200);
            vo.setRetnDesc("处理成功！");
        } else {
            vo.setRetnCode(000);
            vo.setRetnDesc("积分兑换套餐列表获取失败，请稍后再试！");
        }
        return vo;
    }

    /**
     * 积分兑换处理
     * @param param
     * @return
     */
    @Override
    public PointExchangeHandleOutputVo pointExchangeHandle(PointExchangeHandleInputVo param) {

        PointExchangeHandleOutputVo outputVo = new PointExchangeHandleOutputVo();

        // 1、调用第三方扣减接口，如果扣减失败，就返回失败信息到前端 TODO:error

        // 2、扣减用户积分、增加金币操作
        // 取得充值内容
        int exchangeGold = param.getActualGold();
        BigDecimal payAmt = param.getPayAmt();
        // 取得充值前的内容
        int gold = param.getGold();
        int userPoint = param.getUserPoint();
        // 充值后的内容
        gold += exchangeGold;
        userPoint = (new BigDecimal(userPoint).subtract(payAmt)).intValue();
        // 更新用户的金币、积分值
        Map<String, String> updateParam = new HashMap<>();
        updateParam.put("gold", String.valueOf(gold));
        updateParam.put("point", String.valueOf(userPoint));
        updateParam.put("userId", param.getUserId());
        int updateCount = pointExchangeMapper.updateUserGoldAndPoint(updateParam);
        if (updateCount != 1) {
            outputVo.setRetnCode(0000);
            outputVo.setRetnDesc("充值失败,请稍后再试!");
            return outputVo;
        }

        // 增加用户兑换(充值)记录
        int tableId =  Integer.valueOf(param.getUserId()) / 50000 + 1;
        String table = TablesUtils.segmentation(param.getUserId(), DbConstants.USER_RECHARGE_RECORDS);
        UserRechargeRecordsPojo pojo = new UserRechargeRecordsPojo();
        pojo.setTableName(table);
        pojo.setUserId(param.getUserId());
        pojo.setAmt(param.getPayAmt());
        String outTradeNo = UUIDUtil.makeTradeNo(tableId, pojo.getUserId());
        pojo.setNumber(outTradeNo);
        pojo.setKind(PaymentConstants.PAY_KIND_POINT);
        pojo.setBillExplain(String.valueOf(param.getActualGold()));
        int insertCount = pointExchangeMapper.insertUserRechargeRecords(pojo);
        if (insertCount != 1) {
            outputVo.setRetnCode(0000);
            outputVo.setRetnDesc("充值失败,请稍后再试!");
        } else {
            outputVo.setGold(gold);
            outputVo.setUserPoint(userPoint);
            outputVo.setRetnCode(200);
            outputVo.setRetnDesc("充值成功！");

            // 更新个人资料表的字段【用户付费标记】为1-付费
            int update = pointExchangeMapper.updateUserBasePayFlag(param.getUserId());
            if (update != 1) {
                outputVo.setRetnCode(000);
                outputVo.setRetnDesc("更新用户付费标记字段失败！");
            }
        }

        return outputVo;
    }

    /**
     * 根据用户ID获取积分兑换记录
     * @param userId
     * @return
     */
    @Override
    public List<PointExchangeRecordsOutputVo> queryUserRechargeRecords(String userId) {

        Map<String, String> map = new HashMap<>();
        String table = TablesUtils.segmentation(userId, DbConstants.USER_RECHARGE_RECORDS);
        map.put("tableName", table);
        map.put("userId", userId);

        // 获取积分兑换记录
        List<PointExchangeRecordsOutputVo> resultList = pointExchangeMapper.queryUserRechargeRecords(map);
        return resultList;
    }
}
