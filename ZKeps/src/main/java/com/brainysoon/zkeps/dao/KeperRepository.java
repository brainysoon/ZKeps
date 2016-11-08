package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Keper;

/**
 * Created by ken on 16-10-14.
 */
public interface KeperRepository {

    //注册用户
    boolean processRegister(Keper keper);

    //找到用户
    Keper findKeper(String userName);

    //计数当前用户总数
    long countUser();
}