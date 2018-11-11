package com.elasticjob.model;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 2420526671752744597L;

    private String userId;

    private String userName;

    private String province;//省

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
