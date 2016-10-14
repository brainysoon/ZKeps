package com.brainysoon.zkeps.bean;

/**
 * Created by ken on 16-10-14.
 */
public class Keper {

    private String userName;
    private String userPassword;

    public Keper(String userName, String userPassword) {

        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Keper() {
        super();
    }

    //get
    public String getUserName() {
        return this.userName;
    }

    //set
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
