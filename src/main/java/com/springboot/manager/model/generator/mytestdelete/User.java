package com.springboot.manager.model.generator.mytestdelete;

/**
 *   mytestdelete..user
 * @mbg.generated do_not_delete_during_merge
 */
public class User {
    /**
     *   mytestdelete..user.user_id
     * @mbg.generated
     */
    private String userId;

    /**
     *   mytestdelete..user.user_name
     * @mbg.generated
     */
    private String userName;

    /**
     *   mytestdelete..user.user_age
     * @mbg.generated
     */
    private Integer userAge;

    /**
     * @return the value of mytestdelete..user.user_id
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the value for mytestdelete..user.user_id
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return the value of mytestdelete..user.user_name
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the value for mytestdelete..user.user_name
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return the value of mytestdelete..user.user_age
     * @mbg.generated
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the value for mytestdelete..user.user_age
     * @mbg.generated
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}