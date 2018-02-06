package com.springboot.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:03 2018/2/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public  void test1  (){
        logger.debug("111");
        logger.info("222");
        logger.error("333");
    }

}
