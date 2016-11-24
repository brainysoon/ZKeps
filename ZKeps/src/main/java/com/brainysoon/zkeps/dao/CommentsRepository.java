package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Comment;

import java.util.List;

/**
 * Created by brainy on 16-11-24.
 */
public interface CommentsRepository {

    String QUERY_COMMENTS_BY_KEP_ID = "SELECT * FROM comment WHERE kepId=?";

    String ADD_COMMENT = "INSERT INTO comment VALUES(?,?,?,?,?)";

    /**
     * @param kepId
     * @return //返回该帖子所有的评论
     */
    List<Comment> findCommentsByKepId(String kepId);

    /**
     * @param comment //评论
     * @return //状态
     */
    int addCoomment(Comment comment);
}
