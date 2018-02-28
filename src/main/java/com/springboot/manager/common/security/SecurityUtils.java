package com.springboot.manager.common.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:53 2018/2/28
 */
public class SecurityUtils {


    static final String KEY_SHA = "SHA";

    /**
     * 密码加密 SHA加密嵌套MD5加密
     *
     * @param password
     * @return
     */
    public static String encrypt(String password) {
        String result = "";
        byte[] data = password.getBytes();
        try {
            // 先SHA加密获取实例
            MessageDigest sha = MessageDigest.getInstance(KEY_SHA);

            // sha 加密
            sha.update(data);

            // 获得加密以后的字符串
            result = new BigInteger(sha.digest()).toString(32);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return result;
    }
}
