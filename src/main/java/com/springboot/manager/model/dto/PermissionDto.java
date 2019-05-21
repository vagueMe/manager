package com.springboot.manager.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:13 2018/6/13
 */
public class PermissionDto {
    private String urlName;
    List<Integer> roleTypeList = new ArrayList<>();

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public List<Integer> getRoleTypeList() {
        return roleTypeList;
    }

    public void setRoleTypeList(List<Integer> roleTypeList) {
        this.roleTypeList = roleTypeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissionDto)) return false;
        PermissionDto that = (PermissionDto) o;
        return Objects.equals(urlName, that.urlName);
    }


}
