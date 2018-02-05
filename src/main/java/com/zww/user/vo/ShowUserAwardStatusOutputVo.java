package com.zww.user.vo;

/**
 * 用户获奖的奖品详细信息展示输出VO类
 *
 * @author kuang
 * @since 2018.02.05
 * @version 1.0
 */
public class ShowUserAwardStatusOutputVo {

    /**
     * 状态ID
     */
    private int status;

    /**
     * 状态名
     */
    private String statusName;

    /**
     * 状态ID
     * @return
     */
    public int getStatus() {
        return status;
    }

    /**
     * 状态ID
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 状态名
     * @return
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 状态名
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
