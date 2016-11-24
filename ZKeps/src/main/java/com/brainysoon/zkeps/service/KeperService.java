package com.brainysoon.zkeps.service;

import com.brainysoon.zkeps.bean.Keper;

import java.util.List;

/**
 * Created by brainy on 16-11-9.
 */
public interface KeperService {

    String QUERY_KEPER_BY_KEPER_NAME = "SELECT * FROM keper WHERE keperName=?";

    /**
     * @param keperName
     * @return //返回用户实例
     */
    Keper findKeperByKeperName(String keperName);

    /**
     * @param keperName
     * @param password
     * @param email
     * @return //状态吗
     */
    int addKeper(String keperName, String password, String email);

    /**
     * @param keperName
     * @param password
     * @param email
     * @param nickName
     * @param motto
     * @return
     */
    int addKeper(String keperName, String password, String email, String nickName, String motto);

    /**
     * @return //返回所有用户
     */
    List<Keper> findAllKepers();
}
