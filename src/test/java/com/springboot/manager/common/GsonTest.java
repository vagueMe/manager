package com.springboot.manager.common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.springboot.manager.common.Data.TestData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description： Gson json转换的使用，以及Lambda表达式的简易使用
 * @Author:hudi
 * @Date: Created in 15:34 2018/2/8
 */
public class GsonTest {

    @Test
    public void test() throws  Exception{

        List<TestData> testDataList =  Arrays.asList(1,2,3).stream().map((e) ->new TestData(e,"name"+e)).collect(Collectors.toList()); //Collectors
        Gson gson = new Gson();
        String  dateJson = gson.toJson(testDataList);
        System.out.println(dateJson);

        List<TestData> jsonList = gson.fromJson(dateJson,new TypeToken<List<TestData>>(){}.getType());
        jsonList.forEach(System.out::println);

    }


}
