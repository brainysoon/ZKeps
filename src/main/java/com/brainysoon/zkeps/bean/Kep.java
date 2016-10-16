package com.brainysoon.zkeps.bean;

import java.util.Date;

/**
 * Created by ken on 16-10-13.
 */
public class Kep {

    private long kepId;
    private String kepMsg;
    private Date kepTime;
    private String userName;
    private String kepContent;
    private String kepTitle;

    public Kep(long kepId, String kepMsg, Date kepTime, String userName) {

        this.kepId = kepId;
        this.kepMsg = kepMsg;
        this.kepTime = kepTime;
        this.userName = userName;
    }

    public Kep(long kepId, String kepTitle, String kepMsg, String kepContent,
               Date kepTime, String userName) {

        this(kepId, kepMsg, kepTime, userName);

        this.kepTitle = kepTitle;
        this.kepContent = kepContent;
    }

    //get
    public long getKepId() {
        return this.kepId;
    }

    public String getKepMsg() {
        return this.kepMsg;
    }

    public Date getKepTime() {
        return this.kepTime;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getKepContent() {
        return this.kepContent;
    }

    public String getKepTitle() {
        return this.kepTitle;
    }
}
