package com.brainysoon.zkeps.dao.mysql;

import com.brainysoon.zkeps.bean.Comment;
import com.brainysoon.zkeps.dao.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by brainy on 16-11-24.
 */
@Repository
public class CommentsRepositoryImpl implements CommentsRepository, RowMapper<Comment> {

    private static final String COMMENT_ID = "commentId";
    private static final String KEP_ID = "kepId";
    private static final String KEPER_NAME = "keperName";
    private static final String NICK_NAME = "nickName";
    private static final String CONTENT = "content";

    private JdbcOperations jdbcOperations;

    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public List<Comment> findCommentsByKepId(String kepId) {
        return jdbcOperations.query(QUERY_COMMENTS_BY_KEP_ID, new String[]{kepId}, this);
    }

    @Override
    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {

        Comment comment = new Comment();

        comment.setCommentId(rs.getString(COMMENT_ID));
        comment.setKepId(rs.getString(KEP_ID));
        comment.setKeperName(rs.getString(KEPER_NAME));
        comment.setNickName(rs.getString(NICK_NAME));
        comment.setContent(rs.getString(CONTENT));

        return comment;
    }

    @Override
    public int addCoomment(Comment comment) {
        return jdbcOperations.update(ADD_COMMENT, comment.getCommentId(),
                comment.getKepId(), comment.getKeperName(), comment.getNickName(),
                comment.getContent());
    }
}
