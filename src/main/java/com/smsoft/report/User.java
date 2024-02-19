package com.smsoft.report;

import java.util.Date;

public class User {
    private String userId;

    private String userPw;

    private String userName;

    private Date enrollDate;

    public User() {}

    public String getUserId() {

        return userId;

    }

    public void setUserId(String userId) {

        this.userId = userId;

    }

    public String getUserPw() {

        return userPw;

    }

    public void setUserPw(String userPw) {

        this.userPw = userPw;

    }

    public String getUserName() {

        return userName;

    }

    public void setUserName(String userName) {

        this.userName = userName;

    }

    public Date getEnrollDate() {

        return enrollDate;

    }

    public void setEnrollDate(Date enrollDate) {

        this.enrollDate = enrollDate;

    }
}
