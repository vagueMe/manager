package com.springboot.manager.common;

import com.alibaba.fastjson.JSON;
import com.springboot.manager.dao.generator.UserMapper;
import com.springboot.manager.model.dto.UserTest;
import com.springboot.manager.model.generator.User;
import com.springboot.manager.model.generator.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
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
            UserTest user = new UserTest();
            user.setUserAge(999);
            user.setUserId("idddddddddd"+i);
            user.setUserName("nnnnnnnnnnn"+i);
            userMapper.insertSelective(user);
            System.out.println(i);
        }*/
       /* UserExample userExample = new UserExample();
        List<User> list = userMapper.selectByExample(userExample);
        System.out.println(list.size());*/
/*
        UserTest user = new UserTest();
        user.setUserAge(999);
        user.setUserId("idddddddddd");
        user.setUserName("nnnnnnnnnnn");
        user.setUserCreateTime(new Date());
        String str = JSON.toJSONString(user);
         System.out.println(str);*/


        String  dataSource = "231"; // 数据来源
        String businessNo = "10150006000136663008"; // 通知单号
        String bankOrderNo = "39181000000124758749";    // 订单号/银行流水
        String paymentSum = "12"; // 支付金额
        String remark = ""; // 备注
        String paymentDate = "20180327103030";    // 支付时间
        String paymentState = "1";   // 支付结果1-成功，2-失败
        String errorMsg = "交易成功";   // 交易结果信息/失败描述
        String signMsg = "ed4fb96b90bc35250ff19637d65e89d46f9e58c9d48d218130963ea39a6831f2";    // 加签串
        String policyNo = "11073003900153221021";   // 如果支付成功，则自动承保，并返回保单号
        String resultCode = "1"; // 承保结果 1支付成功且承保成功，2支付成功承保失败，3支付失败
        String resultMsg = "支付成功,保单号为:[11073003900153221021]";  // 承保信息
        String msg = MD5Util.sha256Hex (dataSource + businessNo + bankOrderNo + paymentSum + paymentState + policyNo + "OPENAPI");
        System.out.println(msg);
        System.out.println(signMsg);


    }


}
