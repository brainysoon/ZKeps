package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Kep;

import java.util.List;

/**
 * Created by ken on 16-10-13.
 */
public interface KepsRepository {

    String QUERY_KEP_BY_KEP_ID = "SELECT * FROM keps WHERE kepId=?";

    String INSERT_KEP = "INSERT INTO keps VALUES(?,?,?,?,?,?,?)";

    String COUNT_KEPS = "SELECT count(kepId) FROM keps";

    String QUERY_POP_KEPS = "SELECT * FROM keps";

    //获得一定数量的帖子
    List<Kep> findKeps(long max, long count);

    //得到一个帖子
    Kep findOne(long kepId);

    //得到比较热的几个暖贴
    List<Kep> findPopKeps();

    //计数现在的帖子
    long countKeps();

    //添加一个Keps
    boolean addKep(Kep kep);
}
