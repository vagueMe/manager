package com.springboot.manager.model.dto;

import com.springboot.manager.model.generator.User;
import lombok.Data;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:59 2018/3/13
 */
@Data
public class UserTest  extends User{

    private String userId;

    private String userName;

    private Integer userAge;

}
