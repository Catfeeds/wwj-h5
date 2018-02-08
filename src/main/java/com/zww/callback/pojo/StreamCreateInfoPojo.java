package com.zww.callback.pojo;

/**
 * 即构回调流创建记录表实体类
 *
 * @author kuang
 * @since 2018.02.06
 * @version 1.0
 */
public class StreamCreateInfoPojo {

    /**
     * 主键id
     */
    private int id;

    /**
     * Server端参数 流ID 自增数字 流唯一标识
     */
    private int zego_id;

    /**
     * Server端参数 直播ID 自增数字 直播唯一标识
     */
    private int live_id;

    /**
     * 频道ID 对应客户端RoomID 不超过255字节
     */
    private String channel_id;

    /**
     * 标题 不超过255字节
     */
    private String title;

    /**
     * 流名 对应客户端StreamID 不超过255字节
     */
    private String stream_alias;

    /**
     * 发布者ID 对应客户端UserID 不超过255字节
     */
    private String publish_id;

    /**
     * 发布者名字 对应客户端UserName 不超过255字节
     */
    private String publish_name;

    /**
     * RTMP拉流地址 不超过1024字节
     */
    private String rtmp_url_0;

    /**
     * RTMP拉流地址 不超过1024字节
     */
    private String rtmp_url_1;

    /**
     * HLS拉流地址 不超过1024字节
     */
    private String hls_url_0;

    /**
     * HLS拉流地址 不超过1024字节
     */
    private String hls_url_1;

    /**
     * HDL拉流地址 不超过1024字节
     */
    private String hdl_url_0;

    /**
     * HDL拉流地址 不超过1024字节
     */
    private String hdl_url_1;

    /**
     * 截图地址 不超过255字节
     */
    private String pic_url_0;

    /**
     * 创建时间 Uinx时间戳
     */
    private long create_time_zego;

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

    public int getLive_id() {
        return live_id;
    }

    public void setLive_id(int live_id) {
        this.live_id = live_id;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream_alias() {
        return stream_alias;
    }

    public void setStream_alias(String stream_alias) {
        this.stream_alias = stream_alias;
    }

    public String getPublish_id() {
        return publish_id;
    }

    public void setPublish_id(String publish_id) {
        this.publish_id = publish_id;
    }

    public String getPublish_name() {
        return publish_name;
    }

    public void setPublish_name(String publish_name) {
        this.publish_name = publish_name;
    }

    public String getRtmp_url_0() {
        return rtmp_url_0;
    }

    public void setRtmp_url_0(String rtmp_url_0) {
        this.rtmp_url_0 = rtmp_url_0;
    }

    public String getRtmp_url_1() {
        return rtmp_url_1;
    }

    public void setRtmp_url_1(String rtmp_url_1) {
        this.rtmp_url_1 = rtmp_url_1;
    }

    public String getHls_url_0() {
        return hls_url_0;
    }

    public void setHls_url_0(String hls_url_0) {
        this.hls_url_0 = hls_url_0;
    }

    public String getHls_url_1() {
        return hls_url_1;
    }

    public void setHls_url_1(String hls_url_1) {
        this.hls_url_1 = hls_url_1;
    }

    public String getHdl_url_0() {
        return hdl_url_0;
    }

    public void setHdl_url_0(String hdl_url_0) {
        this.hdl_url_0 = hdl_url_0;
    }

    public String getHdl_url_1() {
        return hdl_url_1;
    }

    public void setHdl_url_1(String hdl_url_1) {
        this.hdl_url_1 = hdl_url_1;
    }

    public String getPic_url_0() {
        return pic_url_0;
    }

    public void setPic_url_0(String pic_url_0) {
        this.pic_url_0 = pic_url_0;
    }

    public long getCreate_time_zego() {
        return create_time_zego;
    }

    public void setCreate_time_zego(long create_time_zego) {
        this.create_time_zego = create_time_zego;
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
