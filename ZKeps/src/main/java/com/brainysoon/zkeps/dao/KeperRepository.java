package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Keper;

/**
 * Created by ken on 16-10-14.
 */
public interface KeperRepository {

    String QUERY_KEPER_BY_KEPER_NAME = "SELECT * FROM keper WHERE keperName=?";

    /**
     * @param keperName //用户名
     * @return //实体
     */
    Keper findKeperByKeperName(String keperName);
}
