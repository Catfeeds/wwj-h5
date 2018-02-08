package com.zww.callback.pojo;

/**
 * 即构回调流关闭记录表实体类
 *
 * @author kuang
 * @since 2018.02.06
 * @version 1.0
 */
public class StreamCloseInfoPojo {

    /**
     * 主键id
     */
    private int id;

    /**
     * Server端参数 流ID 自增数字 流唯一标识
     */
    private int zego_id;

    /**
     * 关闭类型 0为正常关闭，非0为异常关闭（1为后台超时关闭，2为同一主播直播关闭之前没有关闭的流）
     */
    private int type;

    /**
     * 频道ID 对应客户端RoomID 不超过255字节
     */
    private String channel_id;

    /**
     * 流名 对应客户端StreamID 不超过255字节
     */
    private String stream_alias;

    /**
     * 第三方自定义数据 默认为空字符串 不超过255字节
     */
    private String third_define_data;

    /**
     * 服务器当前时间 Uinx时间戳
     */
    private long timestamp_zego;

    /**
     * 随机数
     */
    private String nonce;

    /**
     * 检验串 见检验说明
     */
    private String signature;

    /**
     * 可用标志，1-可用，0-不可用
     */
    private int effective;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZego_id() {
        return zego_id;
    }

    public void setZego_id(int zego_id) {
        this.zego_id = zego_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getStream_alias() {
        return stream_alias;
    }

    public void setStream_alias(String stream_alias) {
        this.stream_alias = stream_alias;
    }

    public String getThird_define_data() {
        return third_define_data;
    }

    public void setThird_define_data(String third_define_data) {
        this.third_define_data = third_define_data;
    }

    public long getTimestamp_zego() {
        return timestamp_zego;
    }

    public void setTimestamp_zego(long timestamp_zego) {
        this.timestamp_zego = timestamp_zego;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getEffective() {
        return effective;
    }

    public void setEffective(int effective) {
        this.effective = effective;
    }
}
