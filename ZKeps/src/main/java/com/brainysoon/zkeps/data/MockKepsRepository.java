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
    public List<Kep> findPopKeps() {

        List<Kep> popKeps = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            popKeps.add(new Kep(i, "暖贴" + i, "这是一个关于" + i + "条暖贴的故事",
                    "故事内容", new Date(), "用户" + i));
        }

        return popKeps;
    }

    @Override
    public Kep findOne(long kepId) {

        return new Kep(kepId, "我是第" + kepId + "条帖子", new Date(), "用户" + kepId);
    }
}
