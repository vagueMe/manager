package com.springboot.manager.common.Data;

import lombok.Data;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:40 2018/2/8
 */
@Data
public class TestData {

    private Integer id;

    private String name;

    public TestData(Integer id,String name){
        this.id = id;
        this.name = name;
    }

}
