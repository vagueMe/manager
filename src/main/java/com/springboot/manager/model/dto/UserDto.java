package com.springboot.manager.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.manager.common.serialize.DateToLongSerialize;
import com.springboot.manager.model.generator.User;
import lombok.Data;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:40 2018/2/6
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // 对于空的字段，不会出现在返回结果中
public class UserDto extends User{

    @JsonProperty("loginPassword") //该注解可以使得返回前端的时候 字段变为 “password” 而不是原来的 userPassword
    private String loginPassword;

    @JsonProperty("loginStatus")
    private Integer loginStatus;

    private String loginName;

    @JsonSerialize(using = DateToLongSerialize.class)
    private String testTime;



}
