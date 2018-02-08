package com.springboot.manager.common;

import java.util.UUID;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 11:20 2018/2/8
 */
public class CommonUtils {

    public static String  uuid(){
        return UUID.randomUUID().toString();
    }
}
