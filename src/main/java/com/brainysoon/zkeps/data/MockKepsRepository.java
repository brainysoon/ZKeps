package com.brainysoon.zkeps.data;

import com.brainysoon.zkeps.bean.Kep;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ken on 16-10-13.
 */
@Repository
public class MockKepsRepository implements KepsRepository {

    @Override
    public List<Kep> findKeps(long max, long count) {

        List<Kep> keps = new ArrayList<>();

        for (int i = 1; i <= count; i++) {

            Kep mock = new Kep(i, "第" + i + "条帖子", new Date(), "用户" + i);

            keps.add(mock);
        }

        return keps;
    }

    @Override
    public Kep findOne(long kepId) {

        return new Kep(kepId, "我是第" + kepId + "条帖子", new Date(), "用户" + kepId);
    }
}
