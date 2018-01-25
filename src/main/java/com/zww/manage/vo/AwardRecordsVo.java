package com.zww.manage.vo;

/**
 * Created by hp on 2018/1/25.
 */
public class AwardRecordsVo {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 机器id
     */
    private String macId;
    /**
     * 中奖标示
     */
    private String is;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMacId() {
        return macId;
    }

    public void setMacId(String macId) {
        this.macId = macId;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }
}
