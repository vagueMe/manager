package com.springboot.manager.common;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:19 2018/2/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidTest {

    /**
     * 解密
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        //String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKUAMHrATatXwODDAcHxfIcG6diYsw0l0Qfj/NJivHXMVs5JRYf4vao2nEXB+BxA3gHO0er3KiGpz2ieQjPgSF8CAwEAAQ==";
        //String password = "Q+zSOJytnRLmFHxB9YdFXlMnJj2y60r0Z11OFTRTOYQ/4kzKDWIU6AtFUv+DeVLuitKPGXGIkmalAXaoApOlzw==";
        String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIEopNjvUKeGp5M+aKc+yY/a/PDYKI/O96U04PFFjmZ+ukTf00H0uU7mexYyLx0C6+opdKKdNJfdC94x+2fAdP8CAwEAAQ==";
        String password = "KxU08WZP6Rwi+Ux7fMeUqMU27ojzMdkaicuxkmWeXbiVRX2az/WtAvfep3EavFetTC1hV6Ssve4PzGt//XPZmw==";
        System.out.println(ConfigTools.decrypt(publickey, password));
    }
}
