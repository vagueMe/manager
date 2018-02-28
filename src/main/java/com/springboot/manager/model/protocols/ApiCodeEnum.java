package com.springboot.manager.model.protocols;


/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:26 2018/2/8
 */
public enum ApiCodeEnum {
    // 自定义
    SUCCESS(1, "成功"),
    FAILURE(-1, "失败"),
    UNKONW_ERROR(101, "服务器内部错误"),
    UNAUTHORITY(102, "未授权"),
    TOKEN_INVALID(103, "token无效"),
    PWD_MISTAKE(104, "账号密码不正确"),
    SYNC_SHIPPER_FAILURE(105, "客户信息同步失败"),

    // spring mvc
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_REQUEST(400, "Bad Request"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable");

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
