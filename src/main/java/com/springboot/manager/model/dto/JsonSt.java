package com.springboot.manager.model.dto;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:03 2018/6/11
 */
public class JsonSt {
    private Integer option;

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public static void main(String[] args) {
        Integer value = 0;
        for(int i = 0 ;i<=365 ;i++){
            value +=i;
        }
        System.out.println(value);
    }
}
