package com.springboot.manager.model.protocols;

import lombok.Getter;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:38 2018/2/8
 */
@Getter
public class AnyException  extends RuntimeException{
    private Integer code;

    public AnyException(ApiCodeEnum apiCodeEnum){
        super(apiCodeEnum.getMsg());
        this.code = apiCodeEnum.getCode();
    }

    public AnyException(String msg ){
        super(msg);
        this.code =ApiCodeEnum.FAILURE.getCode();
    }


}
