package com.springboot.manager.model.protocols;

import lombok.Data;

import java.util.Date;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:01 2018/3/2
 */
@Data
public class BaseForm {

    private int pageNum;

    private int pageSize;

    private String orderBy;

    private String keywords;

    private String startTime;

    private String endTime;

    public int getPageSize() {
        if(pageSize == 0){
            pageSize = 10;
        }
        return pageSize;
    }



}
