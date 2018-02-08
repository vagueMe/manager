package com.springboot.manager.model.protocols;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 11:49 2018/2/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {

    private Integer code;

    private String msg;

    private T data;


    public ApiResult(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }


    public ApiResult(AnyException anyException){
       this.code = anyException.getCode();
       this.msg = anyException.getMessage();
    }


    public ApiResult(ApiCodeEnum apiCodeEnum){
        this.code = apiCodeEnum.getCode();
        this.msg = apiCodeEnum.getMsg();
    }


}
