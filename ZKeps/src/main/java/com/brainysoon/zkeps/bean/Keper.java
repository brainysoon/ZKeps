package com.brainysoon.zkeps.bean;

/**
 * Created by ken on 16-10-14.
 */
public class Keper {

    private String keperName;
    private String password;
    private String email;
    private String nickName;
    private String motto;
    private String avator;
    private int stars;
    private int slead;

    //getter
    public String getKeperName() {
        return keperName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getMotto() {
        return motto;
    }

    public String getAvator() {
        return avator;
    }

    public int getStars() {
        return stars;
    }

    public int getSlead() {
        return slead;
    }

    //setter

    public void setKeperName(String keperName) {
        this.keperName = keperName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setSlead(int slead) {
        this.slead = slead;
    }
}
