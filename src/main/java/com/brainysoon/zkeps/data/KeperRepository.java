package com.brainysoon.zkeps.data;

import com.brainysoon.zkeps.bean.Keper;

/**
 * Created by ken on 16-10-14.
 */
public interface KeperRepository {

    //注册用户
    boolean processRegister(Keper keper);

    //找到用户
    Keper findKeper(String userName);
}
