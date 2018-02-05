package com.zww.user.vo;

/**
 * 用户获奖的奖品详细信息展示输入VO类
 *
 * @author kuang
 * @since 2018.02.05
 * @version 1.0
 */
public class ShowUserAwardStatusInputVo {

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户获奖记录ID
     */
    private int id;

    /**
     * 用户ID
     * @return
     */
    public int getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 用户获奖记录ID
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 用户获奖记录ID
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
