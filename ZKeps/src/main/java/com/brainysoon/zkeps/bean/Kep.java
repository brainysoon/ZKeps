package com.brainysoon.zkeps.bean;

import java.sql.Timestamp;

/**
 * Created by ken on 16-10-13.
 */
public class Kep {

    private String kepId;
    private String keperName;
    private Timestamp kepTime;
    private String kepTitle;
    private String kepMsg;
    private String kepContent;
    private int stars;


    //getter
    public String getKepId() {
        return kepId;
    }

    public String getKeperName() {
        return keperName;
    }

    public Timestamp getKepTime() {
        return kepTime;
    }

    public String getKepTitle() {
        return kepTitle;
    }

    public String getKepMsg() {
        return kepMsg;
    }

    public String getKepContent() {
        return kepContent;
    }

    public int getStars() {
        return stars;
    }

    //setter
    public void setKepId(String kepId) {
        this.kepId = kepId;
    }

    public void setKeperName(String keperName) {
        this.keperName = keperName;
    }

    public void setKepTime(Timestamp kepTime) {
        this.kepTime = kepTime;
    }

    public void setKepTitle(String kepTitle) {
        this.kepTitle = kepTitle;
    }

    public void setKepMsg(String kepMsg) {
        this.kepMsg = kepMsg;
    }

    public void setKepContent(String kepContent) {
        this.kepContent = kepContent;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
