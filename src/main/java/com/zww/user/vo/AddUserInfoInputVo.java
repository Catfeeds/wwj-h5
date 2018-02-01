package com.zww.user.vo;

/**
 * 个人信息追加输入VO类
 *
 * @author kuang
 * @since 2018.01.31
 * @version 1.0
 */
public class AddUserInfoInputVo {

    /**
     * 第三方传入的用户ID
     */
    private String loginUserId;

    /**
     * 第三方传入的用户名
     */
    private String loginUserName;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 第三方传入的用户ID
     * @return
     */
    public String getLoginUserId() {
        return loginUserId;
    }

    /**
     * 第三方传入的用户ID
     * @param loginUserId
     */
    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    /**
     * 第三方传入的用户名
     * @return
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    /**
     * 第三方传入的用户名
     * @param loginUserName
     */
    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
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
}
