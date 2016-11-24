package com.brainysoon.zkeps.service;

import com.brainysoon.zkeps.bean.Comment;
import com.brainysoon.zkeps.bean.Keper;

import java.util.List;

/**
 * Created by brainy on 16-11-24.
 */
public interface CommentsService {

    /**
     * @param kepId
     * @return //返回该帖子的所有评论
     */
    List<Comment> findCommentsByKepId(String kepId);

    /**
     * @param keper   //用户
     * @param kepId   //帖子
     * @param content //评论
     * @return //返回状态值
     */
    int addComment(Keper keper, String kepId, String content);
}
