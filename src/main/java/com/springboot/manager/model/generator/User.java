package com.springboot.manager.model.generator;

/**
 *   my_user
 * @mbg.generated do_not_delete_during_merge
 */
public class User {
    /**
     *   my_user.user_id
     * @mbg.generated
     */
    private String userId;

    /**
     *   my_user.user_name
     * @mbg.generated
     */
    private String userName;

    /**
     *   my_user.user_age
     * @mbg.generated
     */
    private Integer userAge;

    /**
     * @return the value of my_user.user_id
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the value for my_user.user_id
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return the value of my_user.user_name
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the value for my_user.user_name
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return the value of my_user.user_age
     * @mbg.generated
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the value for my_user.user_age
     * @mbg.generated
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}