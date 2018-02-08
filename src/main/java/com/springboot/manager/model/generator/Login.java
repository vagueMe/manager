package com.springboot.manager.model.generator;

import java.util.Date;

/**
 *   my_login
 * @mbg.generated do_not_delete_during_merge
 */
public class Login {
    /**
     *   用户id
     *   my_login.my_login_user_id
     * @mbg.generated
     */
    private String myLoginUserId;

    /**
     *   登录用户名
     *   my_login.my_login_name
     * @mbg.generated
     */
    private String myLoginName;

    /**
     *   登录密码
     *   my_login.my_login_password
     * @mbg.generated
     */
    private String myLoginPassword;

    /**
     *   注册时间
     *   my_login.my_login_create_time
     * @mbg.generated
     */
    private Date myLoginCreateTime;

    /**
     *   修改时间
     *   my_login.my_login_update_time
     * @mbg.generated
     */
    private Date myLoginUpdateTime;

    /**
     *   登录状态
     *   my_login.my_login_status
     * @mbg.generated
     */
    private Integer myLoginStatus;

    /**
     *   是否删除：0-未删除，1-已删除
     *   my_login.my_login_is_delete
     * @mbg.generated
     */
    private Boolean myLoginIsDelete;

    /**
     * 用户id
     * @return the value of my_login.my_login_user_id
     * @mbg.generated
     */
    public String getMyLoginUserId() {
        return myLoginUserId;
    }

    /**
     * 用户id
     * @param myLoginUserId the value for my_login.my_login_user_id
     * @mbg.generated
     */
    public void setMyLoginUserId(String myLoginUserId) {
        this.myLoginUserId = myLoginUserId == null ? null : myLoginUserId.trim();
    }

    /**
     * 登录用户名
     * @return the value of my_login.my_login_name
     * @mbg.generated
     */
    public String getMyLoginName() {
        return myLoginName;
    }

    /**
     * 登录用户名
     * @param myLoginName the value for my_login.my_login_name
     * @mbg.generated
     */
    public void setMyLoginName(String myLoginName) {
        this.myLoginName = myLoginName == null ? null : myLoginName.trim();
    }

    /**
     * 登录密码
     * @return the value of my_login.my_login_password
     * @mbg.generated
     */
    public String getMyLoginPassword() {
        return myLoginPassword;
    }

    /**
     * 登录密码
     * @param myLoginPassword the value for my_login.my_login_password
     * @mbg.generated
     */
    public void setMyLoginPassword(String myLoginPassword) {
        this.myLoginPassword = myLoginPassword == null ? null : myLoginPassword.trim();
    }

    /**
     * 注册时间
     * @return the value of my_login.my_login_create_time
     * @mbg.generated
     */
    public Date getMyLoginCreateTime() {
        return myLoginCreateTime;
    }

    /**
     * 注册时间
     * @param myLoginCreateTime the value for my_login.my_login_create_time
     * @mbg.generated
     */
    public void setMyLoginCreateTime(Date myLoginCreateTime) {
        this.myLoginCreateTime = myLoginCreateTime;
    }

    /**
     * 修改时间
     * @return the value of my_login.my_login_update_time
     * @mbg.generated
     */
    public Date getMyLoginUpdateTime() {
        return myLoginUpdateTime;
    }

    /**
     * 修改时间
     * @param myLoginUpdateTime the value for my_login.my_login_update_time
     * @mbg.generated
     */
    public void setMyLoginUpdateTime(Date myLoginUpdateTime) {
        this.myLoginUpdateTime = myLoginUpdateTime;
    }

    /**
     * 登录状态
     * @return the value of my_login.my_login_status
     * @mbg.generated
     */
    public Integer getMyLoginStatus() {
        return myLoginStatus;
    }

    /**
     * 登录状态
     * @param myLoginStatus the value for my_login.my_login_status
     * @mbg.generated
     */
    public void setMyLoginStatus(Integer myLoginStatus) {
        this.myLoginStatus = myLoginStatus;
    }

    /**
     * 是否删除：0-未删除，1-已删除
     * @return the value of my_login.my_login_is_delete
     * @mbg.generated
     */
    public Boolean getMyLoginIsDelete() {
        return myLoginIsDelete;
    }

    /**
     * 是否删除：0-未删除，1-已删除
     * @param myLoginIsDelete the value for my_login.my_login_is_delete
     * @mbg.generated
     */
    public void setMyLoginIsDelete(Boolean myLoginIsDelete) {
        this.myLoginIsDelete = myLoginIsDelete;
    }
}