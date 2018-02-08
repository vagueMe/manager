package com.springboot.manager.model.generator;

import java.util.Date;

/**
 *   my_login
 * @mbg.generated do_not_delete_during_merge
 */
public class Login {
    /**
     *   用户id
     *   my_login.login_user_id
     * @mbg.generated
     */
    private String loginUserId;

    /**
     *   登录用户名
     *   my_login.login_name
     * @mbg.generated
     */
    private String loginName;

    /**
     *   登录密码
     *   my_login.login_password
     * @mbg.generated
     */
    private String loginPassword;

    /**
     *   注册时间
     *   my_login.login_create_time
     * @mbg.generated
     */
    private Date loginCreateTime;

    /**
     *   修改时间
     *   my_login.login_update_time
     * @mbg.generated
     */
    private Date loginUpdateTime;

    /**
     *   登录状态
     *   my_login.login_status
     * @mbg.generated
     */
    private Integer loginStatus;

    /**
     *   是否删除：0-未删除，1-已删除
     *   my_login.login_is_delete
     * @mbg.generated
     */
    private Boolean loginIsDelete;

    /**
     * 用户id
     * @return the value of my_login.login_user_id
     * @mbg.generated
     */
    public String getLoginUserId() {
        return loginUserId;
    }

    /**
     * 用户id
     * @param loginUserId the value for my_login.login_user_id
     * @mbg.generated
     */
    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId == null ? null : loginUserId.trim();
    }

    /**
     * 登录用户名
     * @return the value of my_login.login_name
     * @mbg.generated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 登录用户名
     * @param loginName the value for my_login.login_name
     * @mbg.generated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 登录密码
     * @return the value of my_login.login_password
     * @mbg.generated
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 登录密码
     * @param loginPassword the value for my_login.login_password
     * @mbg.generated
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * 注册时间
     * @return the value of my_login.login_create_time
     * @mbg.generated
     */
    public Date getLoginCreateTime() {
        return loginCreateTime;
    }

    /**
     * 注册时间
     * @param loginCreateTime the value for my_login.login_create_time
     * @mbg.generated
     */
    public void setLoginCreateTime(Date loginCreateTime) {
        this.loginCreateTime = loginCreateTime;
    }

    /**
     * 修改时间
     * @return the value of my_login.login_update_time
     * @mbg.generated
     */
    public Date getLoginUpdateTime() {
        return loginUpdateTime;
    }

    /**
     * 修改时间
     * @param loginUpdateTime the value for my_login.login_update_time
     * @mbg.generated
     */
    public void setLoginUpdateTime(Date loginUpdateTime) {
        this.loginUpdateTime = loginUpdateTime;
    }

    /**
     * 登录状态
     * @return the value of my_login.login_status
     * @mbg.generated
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    /**
     * 登录状态
     * @param loginStatus the value for my_login.login_status
     * @mbg.generated
     */
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * 是否删除：0-未删除，1-已删除
     * @return the value of my_login.login_is_delete
     * @mbg.generated
     */
    public Boolean getLoginIsDelete() {
        return loginIsDelete;
    }

    /**
     * 是否删除：0-未删除，1-已删除
     * @param loginIsDelete the value for my_login.login_is_delete
     * @mbg.generated
     */
    public void setLoginIsDelete(Boolean loginIsDelete) {
        this.loginIsDelete = loginIsDelete;
    }
}