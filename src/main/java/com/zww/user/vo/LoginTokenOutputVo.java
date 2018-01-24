package com.zww.user.vo;

/**
 * LoginToken接口的返回VO
 *
 * @author kuang
 * @since 2018.01.23
 * @version 1.0
 */
public class LoginTokenOutputVo {

    /**
     * ver
     */
    private String ver;

    /**
     * hash
     */
    private String hash;

    /**
     * nonce
     */
    private String nonce;

    /**
     * expired
     */
    private String expired;

    /**
     * ver
     * @return
     */
    public String getVer() {
        return ver;
    }

    /**
     * ver
     * @param ver
     */
    public void setVer(String ver) {
        this.ver = ver;
    }

    /**
     * hash
     * @return
     */
    public String getHash() {
        return hash;
    }

    /**
     * hash
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * nonce
     * @return
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * nonce
     * @param nonce
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * expired
     * @return
     */
    public String getExpired() {
        return expired;
    }

    /**
     * expired
     * @param expired
     */
    public void setExpired(String expired) {
        this.expired = expired;
    }
}
