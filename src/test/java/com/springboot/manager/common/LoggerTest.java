package com.springboot.manager.common;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:03 2018/2/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public  void test1  (){

        logger.debug("111");
        logger.info("222");
        logger.error("333");

        log.info("111"); // 这里是使用的是 lombak 的@Log4j 注解生成的log对象  注：在使用lombak 之前idea要先安装插件
    }

    @Test
    public  void test2()  {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
            Date date1 = simpleDateFormat.parse("2019-01-12 18:04:30"); //  60000 yifenz

            Date date2 = simpleDateFormat.parse("2019-01-12 18:06:30");

            System.out.println(date1.getTime());
            System.out.println(date2.getTime());
            System.out.println(date2.getTime() - date1.getTime());
            long info = Math.abs(date2.getTime() - date1.getTime()) / 60000;
            System.out.println(info);
        }catch (Exception e){

        }

    }

}
