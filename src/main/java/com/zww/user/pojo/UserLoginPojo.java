package com.zww.user.pojo;

import java.sql.Timestamp;

/**
 * 用户登录表实体类
 *
 * @author kuang
 * @since 2018.01.31
 * @version 1.0
 */
public class UserLoginPojo {

    /**
     * 用户id
     */
    private int id;

    /**
     * 微信openId
     */
    private String wxopenId;

    /**
     * 融云id
     */
    private String tokenId;

    /**
     * 第三方用户登录ID
     */
    private String loginId;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 可用标志
     */
    private byte effective;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 微信unionId
     */
    private String unionId;

    /**
     * 用户id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 用户id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 微信openId
     * @return
     */
    public String getWxopenId() {
        return wxopenId;
    }

    /**
     * 微信openId
     * @param wxopenId
     */
    public void setWxopenId(String wxopenId) {
        this.wxopenId = wxopenId;
    }

    /**
     * 融云id
     * @return
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * 融云id
     * @param tokenId
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * 第三方用户登录ID
     * @return
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 第三方用户登录ID
     * @param loginId
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 用户电话
     * @return
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 用户电话
     * @param userTel
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * 可用标志
     * @return
     */
    public byte getEffective() {
        return effective;
    }

    /**
     * 可用标志
     * @param effective
     */
    public void setEffective(byte effective) {
        this.effective = effective;
    }

    /**
     * 创建时间
     * @return
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 微信unionId
     * @return
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 微信unionId
     * @param unionId
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
}
