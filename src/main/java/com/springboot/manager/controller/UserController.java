package com.springboot.manager.controller;

import com.springboot.manager.model.dto.UserDto;
import com.springboot.manager.model.protocols.ApiResult;
import com.springboot.manager.model.protocols.BaseController;
import com.springboot.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 10:38 2018/2/8
 */
@RestController // 返回json数据
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ApiResult userRegister(UserDto userDto){
        userService.register(userDto);
        return success("注册成功");
    }

    @GetMapping("/getUser")
    public ApiResult getUserList(@RequestParam(value="userId",defaultValue = "id0")String userId ){
        System.out.println("88811");
        return success(userService.getUserDto(userId));
    }
}
