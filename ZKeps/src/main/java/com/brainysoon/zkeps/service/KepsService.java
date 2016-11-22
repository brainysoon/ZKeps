package com.brainysoon.zkeps.service;

import com.brainysoon.zkeps.bean.Kep;

import java.util.List;

/**
 * Created by brainy on 16-11-9.
 */
public interface KepsService {
    /**
     * 分页每页展示的帖子数目
     */
    int PAGE_MAX_NUM = 5;


    /**
     * @param pageIndex //显示第几页的流行帖子
     * @return //pageIndex 指定页数的流行帖子
     */
    List<Kep> showPopKeps(int pageIndex);

    /**
     * @return 最大的页数
     */
    int getPopKepsPageMax();
}
