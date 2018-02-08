package com.springboot.manager.common;

import com.springboot.manager.dao.generator.UserMapper;
import com.springboot.manager.model.generator.User;
import com.springboot.manager.model.generator.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:05 2018/2/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DBOperateTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
       /* for(int i = 0;i<3;i++){
            User user = new User();
            user.setUserAge(i);
            user.setUserId("id"+i);
            user.setUserName("name"+i);
            userMapper.insertSelective(user);
            System.out.println(i);
        }*/
        UserExample userExample = new UserExample();
        List<User> list = userMapper.selectByExample(userExample);
        System.out.println(list.size());
    }


}
