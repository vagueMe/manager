package com.springboot.manager.model.protocols;


/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:26 2018/2/8
 */
public enum ApiCodeEnum {
    SUCCESS(1,"成功"),
    FAILURE(-1,"失败");

    private Integer code;

    private String Msg;

    ApiCodeEnum(Integer code, String msg) {
        this.code = code;
        Msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return Msg;
    }
}
