package com.springboot.manager.model.protocols;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:24 2018/2/8
 */
public class BaseController<T> {

    protected final ApiResult<T> success(){
        return new ApiResult(ApiCodeEnum.SUCCESS.getCode(),ApiCodeEnum.SUCCESS.getMsg());
    }

    protected final ApiResult<T> success(String msg){
        return new ApiResult(ApiCodeEnum.SUCCESS.getCode(),msg);
    }

    protected final ApiResult<T> success(T date){
        return new ApiResult(ApiCodeEnum.SUCCESS.getCode(),ApiCodeEnum.SUCCESS.getMsg(),date);
    }

    protected final  ApiResult<Object> success(String msg, Object data) {
        return new ApiResult<Object>(ApiCodeEnum.SUCCESS.getCode(), msg, data);
    }


    protected final ApiResult<T> error(){
        return new ApiResult(ApiCodeEnum.FAILURE.getCode(),ApiCodeEnum.FAILURE.getMsg());
    }

    protected final ApiResult<T> error(String msg){
        return new ApiResult(ApiCodeEnum.FAILURE.getCode(),msg);
    }
/*
    这两个不要的原因是因为同一异常处理的结果吗？？ 后面再来验证
    protected final ApiResult<T> error(AnyException anyException){
        return new ApiResult(anyException);
    }

    protected final ApiResult<T> error(ApiCodeEnum apiCodeEnum){
        return new ApiResult(apiCodeEnum);
    }
*/

}
