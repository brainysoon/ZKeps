package com.brainysoon.zkeps.service;

import com.brainysoon.zkeps.bean.Keper;

/**
 * Created by brainy on 16-11-22.
 */
public interface StatusService {

    /**
     * @param keperName //用户名
     * @param password  //密码
     * @return 登录状态吗
     */
    int processLogin(String keperName, String password);

    /**
     * @param keperName //用户名
     * @return //用户
     */
    Keper findKeperByKeperName(String keperName);
}
