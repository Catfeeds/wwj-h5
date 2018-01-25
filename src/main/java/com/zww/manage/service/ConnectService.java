package com.zww.manage.service;

import com.zww.manage.vo.AwardRecordsVo;

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
}
