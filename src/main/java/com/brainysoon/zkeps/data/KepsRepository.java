package com.brainysoon.zkeps.data;

import com.brainysoon.zkeps.bean.Kep;

import java.util.List;

/**
 * Created by ken on 16-10-13.
 */
public interface KepsRepository {

    //获得一定数量的帖子
    List<Kep> findKeps(long max, long count);
}
