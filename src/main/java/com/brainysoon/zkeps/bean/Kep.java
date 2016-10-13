package com.brainysoon.zkeps.bean;

import java.util.Date;

/**
 * Created by ken on 16-10-13.
 */
public class Kep {

    private final long kepId;
    private final String kepMsg;
    private final Date kepTime;
    private final String userName;

    public Kep(long kepId, String kepMsg, Date kepTime, String userName) {

        this.kepId = kepId;
        this.kepMsg = kepMsg;
        this.kepTime = kepTime;
        this.userName = userName;
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
}
