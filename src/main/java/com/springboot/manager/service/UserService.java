package com.springboot.manager.service;

import com.springboot.manager.model.dto.UserDto;
import com.springboot.manager.model.generator.User;
import com.springboot.manager.model.protocols.AuthUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 10:40 2018/2/8
 */
public interface UserService {

    void register(UserDto userDto);

    //User getUser(String userId);

    UserDto getUserDto(String userId);

    //List<User> getUserList();

    AuthUser login(String userName ,String password);


}
