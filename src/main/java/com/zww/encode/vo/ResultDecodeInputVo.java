package com.zww.encode.vo;

/**
 * 游戏结果校验处理的入参VO类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
public class ResultDecodeInputVo {

    /**
     * session ID
     */
    private String sessionId;

    /**
     * 确认内容，1: 中奖，0: 未中奖
     */
    private int result;

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 时间戳
     */
    private long timeStamp;

    /**
     * 加密结果
     */
    private String encryptedResult;

    /**
     * session ID
     * @return
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * session ID
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 确认内容，1: 中奖，0: 未中奖
     * @return
     */
    public int getResult() {
        return result;
    }

    /**
     * 确认内容，1: 中奖，0: 未中奖
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * 用户ID
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * 用户ID
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 时间戳
     * @return
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * 时间戳
     * @param timeStamp
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * 加密结果
     * @return
     */
    public String getEncryptedResult() {
        return encryptedResult;
    }

    /**
     * 加密结果
     * @param encryptedResult
     */
    public void setEncryptedResult(String encryptedResult) {
        this.encryptedResult = encryptedResult;
    }
}
