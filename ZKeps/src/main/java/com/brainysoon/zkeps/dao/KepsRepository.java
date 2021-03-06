package com.brainysoon.zkeps.dao;

import com.brainysoon.zkeps.bean.Kep;

import java.util.List;

/**
 * Created by ken on 16-10-13.
 */
public interface KepsRepository {

    String QUERY_POP_KEPS_BY_PAGE_INDEX = "SELECT * FROM kep WHERE stars>0 ORDER BY stars DESC";
    String INSERT_KEP = "INSERT INTO kep VALUES(?,?,?,?,?,?,?)";
    String QUERY_KEPS_BY_KEPER_NAME = "SELECT * FROM kep WHERE keperName=? ORDER BY kepId DESC";
    String QUERY_KEP_BY_KEP_ID = "SELECT * FROM kep WHERE kepId=?";
    String UPDATE_KEP_STARS = "UPDATE kep SET stars=stars+? WHERE kepId=?";

    /**
     * @return //找到流行的帖子 //暂时规定 stars >1 为流行的帖子
     * 新发的帖子不算流行的
     */
    List<Kep> findPopKeps();

    /**
     * @param kep
     * @return //状态吗
     */
    int addKep(Kep kep);

    /**
     * @param keperName
     * @return //返回这个人的所有帖子
     */
    List<Kep> findKepsByKeperName(String keperName);

    /**
     * @param kepId
     * @return //返回具体的帖子
     */
    Kep findKepByKepId(String kepId);

    /**
     * @param kepId
     * @param up    //增加热度
     * @return //返回状态
     */
    int updateKepStars(String kepId, int up);
}
