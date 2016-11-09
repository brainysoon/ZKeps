package com.brainysoon.zkeps.service;

import com.brainysoon.zkeps.bean.Kep;

import java.util.List;

/**
 * Created by brainy on 16-11-9.
 */
public interface KepsService {

    /**
     * @return 返回流行的帖子
     */
    List<Kep> showPopKeps();

    /**
     * @param kep 要添加的帖子
     * @return 添加一个帖子
     */
    boolean addKep(Kep kep);

    /**
     * @param kepId 通过kepId 来查找 kep
     * @return 返回查找到的 kep 如果没有 则返回null
     */
    Kep showKepByKepId(String kepId);
}
