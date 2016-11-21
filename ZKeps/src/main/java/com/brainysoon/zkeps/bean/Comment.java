package com.brainysoon.zkeps.bean;

/**
 * Created by brainy on 16-11-20.
 */
public class Comment {

    private String commentId;
    private String kepId;
    private String content;

    //getter
    public String getCommentId() {
        return commentId;
    }

    public String getKepId() {
        return kepId;
    }

    public String getContent() {
        return content;
    }

    //setter
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setKepId(String kepId) {
        this.kepId = kepId;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
