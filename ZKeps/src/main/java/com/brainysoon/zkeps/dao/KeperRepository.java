package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Keper;

import java.util.List;

/**
 * Created by ken on 16-10-14.
 */
public interface KeperRepository {

    String QUERY_KEPER_BY_KEPER_NAME = "SELECT * FROM keper WHERE keperName=?";

    String ADD_KEPER = "INSERT INTO keper VALUES(?,?,?,?,?,?,?,?)";

    String QUERY_ALL_KEPERS = "SELECT * FROM keper";

    /**
     * @param keperName //用户名
     * @return //实体
     */
    Keper findKeperByKeperName(String keperName);

    /**
     * @param keper
     * @return //状态吗
     */
    int addKeper(Keper keper);

    /**
     * @return //返回所有用户
     */
    List<Keper> findAllKepers();
}
