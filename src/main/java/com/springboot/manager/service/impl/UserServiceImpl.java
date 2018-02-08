package com.springboot.manager.service.impl;

import com.alibaba.fastjson.JSON;
import com.springboot.manager.common.CommonUtils;
import com.springboot.manager.dao.generator.LoginMapper;
import com.springboot.manager.dao.generator.UserMapper;
import com.springboot.manager.model.dto.UserDto;
import com.springboot.manager.model.generator.Login;
import com.springboot.manager.model.generator.User;
import com.springboot.manager.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 10:41 2018/2/8
 */
@Service
@Transactional
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public void register(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        user.setUserId(CommonUtils.uuid());
        user.setUserIsDelete(false);
        user.setUserCreateTime(new Date());
        user.setUserCreateUserId(user.getUserId());
        user.setUserStatus(0);
        user.setUserType(0);
        userMapper.insertSelective(user);

        Login login = new Login();
        BeanUtils.copyProperties(userDto,login);
        login.setLoginUserId(user.getUserId());
        login.setLoginCreateTime(user.getUserCreateTime());
        login.setLoginIsDelete(false);
        login.setLoginStatus(0);
        loginMapper.insertSelective(login);


        //User user = JSON.parseObject(userDtoJsonString ,User.class);
    }

    @Override
    public UserDto getUserDto(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserDto userDto = new UserDto();
        if(user != null){
            BeanUtils.copyProperties(user,userDto);
        }
        Login login = loginMapper.selectByPrimaryKey(userId);
        userDto.setLoginPassword(login.getLoginPassword());
        userDto.setLoginStatus(login.getLoginStatus());
        userDto.setLoginName(login.getLoginName());
        return userDto;
    }

    @Override
    public boolean login(UserDto userDto) {
        return false;
    }
}
