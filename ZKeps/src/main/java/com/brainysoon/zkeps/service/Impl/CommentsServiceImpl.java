package com.brainysoon.zkeps.service.Impl;

import com.brainysoon.zkeps.bean.Comment;
import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.CommentsRepository;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.service.CommentsService;
import com.brainysoon.zkeps.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brainy on 16-11-24.
 */
@Service
public class CommentsServiceImpl implements CommentsService {

    private CommentsRepository commentsRepository;
    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {
        this.kepsRepository = kepsRepository;
    }

    @Autowired
    public void setCommentsRepository(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    @Override
    public List<Comment> findCommentsByKepId(String kepId) {
        return commentsRepository.findCommentsByKepId(kepId);
    }

    @Override
    public int addComment(Keper keper, String kepId, String content) {

        Comment comment = new Comment();

        comment.setCommentId(DateUtils.getInstance().getKepIdDateInfo());
        comment.setKepId(kepId);
        comment.setKeperName(keper.getKeperName());
        comment.setNickName(keper.getNickName());
        comment.setContent(content);

        int code = commentsRepository.addCoomment(comment);

        if (code > 0) {

            //增加热度
            kepsRepository.updateKepStars(kepId, 1);
        }

        return code;
    }
}
