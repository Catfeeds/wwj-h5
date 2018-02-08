package com.zww.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * AES 工具类。
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
public class AESUtil {

    static final private int IV_LENGTH = 16;

    static final private String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    /**
     * 加密.
     *
     * @param content
     *            需要加密的内容
     * @param secretKey
     *            加密key
     * @return 返回加密的内容
     * @throws Exception
     *             抛出加密异常
     */
    public static byte[] encrypt(String content, byte[] secretKey) throws Exception {
        if (secretKey.length != 32) {
            return null;
        }
        SecretKeySpec key = new SecretKeySpec(secretKey, "AES");
        SecureRandom rnd = new SecureRandom();
        byte[] newSeed = rnd.generateSeed(IV_LENGTH);
        rnd.setSeed(newSeed);
        byte[] ivBytes = new byte[IV_LENGTH];
        rnd.nextBytes(ivBytes);
        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] contentBytes = cipher.doFinal(content.getBytes("UTF-8"));
        byte[] encryptedBytes = new byte[ivBytes.length + contentBytes.length];
        System.arraycopy(ivBytes, 0, encryptedBytes, 0, ivBytes.length);
        System.arraycopy(contentBytes, 0, encryptedBytes, ivBytes.length, contentBytes.length);
        return Base64.encodeBase64(encryptedBytes);
    }

    /**
     * 解密.
     *
     * @param content
     *            需要解密的内容
     * @param secretKey
     *            解密key
     * @return 返回解密的内容
     * @throws Exception
     *             抛出解密异常
     */
    public static byte[] decrypt(String content, byte[] secretKey) throws Exception {

        if (secretKey.length != 32) {
            return null;
        }

        byte[] decryptBytes = Base64.decodeBase64(content.getBytes("UTF-8"));
        byte[] ivBytes = new byte[IV_LENGTH];
        System.arraycopy(decryptBytes, 0, ivBytes, 0, IV_LENGTH);

        byte[] contentBytes = new byte[decryptBytes.length - IV_LENGTH];
        System.arraycopy(decryptBytes, IV_LENGTH, contentBytes, 0, decryptBytes.length - IV_LENGTH);

        SecretKeySpec key = new SecretKeySpec(secretKey, "AES");
        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);

        return cipher.doFinal(contentBytes);
    }
}
