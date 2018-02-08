package com.springboot.manager.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.manager.model.generator.User;
import lombok.Data;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:40 2018/2/6
 */
@Data
public class UserDto extends User{

    @JsonProperty("password") //该注解可以使得返回前端的时候 字段变为 “password” 而不是原来的 userPassword
    private String userPassword;

    @JsonProperty("mobile")
    private String userMobile;




}
