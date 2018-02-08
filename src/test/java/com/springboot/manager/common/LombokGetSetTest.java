package com.springboot.manager.common;

import com.springboot.manager.model.dto.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:42 2018/2/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokGetSetTest {

    @Test
    public void test1(){
        UserDto userDto = new UserDto();
        userDto.setUserId("id");
        userDto.setUserName("name");

        System.out.println(userDto.toString());
    }

}
