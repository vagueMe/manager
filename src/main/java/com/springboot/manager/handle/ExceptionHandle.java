package com.springboot.manager.handle;

import com.springboot.manager.model.protocols.AnyException;
import com.springboot.manager.model.protocols.ApiCodeEnum;
import com.springboot.manager.model.protocols.ApiResult;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import javax.validation.ConstraintViolationException;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:44 2018/2/28
 */

@RestControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(Exception.class)
    public ApiResult handle(Exception ex){

        try {
            if (ex instanceof AnyException) {
                AnyException anyException = (AnyException) ex;
                if (anyException.getCode().equals(ApiCodeEnum.UNKONW_ERROR.getCode())) {
                    log.error(anyException.getMessage(), ex);
                }
                return new ApiResult(anyException);
            } else if (ex instanceof ExpiredJwtException) {
                return new ApiResult(ApiCodeEnum.TOKEN_INVALID);
            } else if (ex instanceof NoSuchRequestHandlingMethodException) {
                return new ApiResult(ApiCodeEnum.NOT_FOUND);
            } else if (ex instanceof HttpRequestMethodNotSupportedException) {
                return new ApiResult(ApiCodeEnum.METHOD_NOT_ALLOWED);
            } else if (ex instanceof HttpMediaTypeNotSupportedException) {
                return new ApiResult(ApiCodeEnum.UNSUPPORTED_MEDIA_TYPE);
            } else if (ex instanceof HttpMediaTypeNotAcceptableException) {
                return new ApiResult(ApiCodeEnum.NOT_ACCEPTABLE);
            } else if (ex instanceof MissingPathVariableException) {
                return new ApiResult(ApiCodeEnum.INTERNAL_SERVER_ERROR);
            } else if (ex instanceof MissingServletRequestParameterException) {
                return new ApiResult(ApiCodeEnum.BAD_REQUEST);
            } else if (ex instanceof ServletRequestBindingException) {
                return new ApiResult(ApiCodeEnum.BAD_REQUEST);
            } else if (ex instanceof ConversionNotSupportedException) {
                return new ApiResult(ApiCodeEnum.INTERNAL_SERVER_ERROR);
            } else if (ex instanceof TypeMismatchException) {
                return new ApiResult(ApiCodeEnum.BAD_REQUEST);
            } else if (ex instanceof HttpMessageNotReadableException) {
                return new ApiResult(ApiCodeEnum.BAD_REQUEST);
            } else if (ex instanceof HttpMessageNotWritableException) {
                return new ApiResult(ApiCodeEnum.INTERNAL_SERVER_ERROR);
            } else if (ex instanceof MethodArgumentNotValidException) {
                MethodArgumentNotValidException exception = (MethodArgumentNotValidException) ex;
                String result = dealBindingResult(exception.getBindingResult());
                return new ApiResult(ApiCodeEnum.BAD_REQUEST.getCode(), result);
            } else if (ex instanceof MissingServletRequestPartException) {
                return new ApiResult(ApiCodeEnum.BAD_REQUEST);
            } else if (ex instanceof BindException) {
                BindException exception = (BindException) ex;
                String result = dealBindingResult(exception.getBindingResult());
                return new ApiResult(ApiCodeEnum.BAD_REQUEST.getCode(), result);
            } else if (ex instanceof NoHandlerFoundException) {
                return new ApiResult(ApiCodeEnum.NOT_FOUND);
            } else if (ex instanceof AsyncRequestTimeoutException) {
                return new ApiResult(ApiCodeEnum.SERVICE_UNAVAILABLE);
            } else if(ex instanceof ConstraintViolationException){
                throw ex;
            }else{
                if (log.isWarnEnabled()) {
                    log.warn("Unknown exception type: " + ex.getClass().getName());
                }
                log.error(ex.getMessage(), ex);
                return new ApiResult(ApiCodeEnum.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            log.error(ex.getMessage(), ex);
            return new ApiResult(ApiCodeEnum.UNKONW_ERROR);
        }


    }

    private String dealBindingResult(BindingResult bindingResult) {
        StringBuilder sb = new StringBuilder();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            sb.append(fieldError.getField())
                    .append(":")
                    .append(fieldError.getDefaultMessage())
                    .append(";");
        });
        return sb.toString();
    }


}
