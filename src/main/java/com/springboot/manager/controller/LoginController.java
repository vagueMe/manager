package com.springboot.manager.controller;

import com.springboot.manager.model.protocols.ApiResult;
import com.springboot.manager.model.protocols.AuthUser;
import com.springboot.manager.model.protocols.BaseController;
import com.springboot.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 11:55 2018/2/27
 */
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/in")
    public ApiResult in (HttpServletRequest request , HttpServletResponse response ,String userName ,String password){
        AuthUser authUser = userService.login(userName,password);
        return success("登录成功",authUser);
    }

    @GetMapping("/out")
    public ModelAndView out (HttpServletRequest request , HttpServletResponse response , @RequestParam(value="userId",defaultValue = "id0")String userId ){
        Map<String ,Object> map = new HashMap<>();
        map.put("users",userService.getUserDto(userId));
        return new ModelAndView("example",map);
    }


    @PostMapping("/redisIn")
    public ApiResult redisIn (HttpServletRequest request , HttpServletResponse response ,String userName ,String password){
        AuthUser authUser = userService.redisIn(userName,password);
        if ("fail".equals(authUser.getToken()) || "".equals(authUser.getToken()) ) {
            return error("用户名或密码不正确");
        }
        return success("登录成功",authUser);
    }


}
