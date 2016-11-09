package com.brainysoon.zkeps.dao.mock;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;

import java.util.List;

/**
 * Created by ken on 16-10-13.
 */
//@Repository
public class MockKepsRepository implements KepsRepository {

    @Override
    public List<Kep> findKeps(long max, long count) {
        return null;
    }

    @Override
    public Kep findOne(long kepId) {
        return null;
    }

    @Override
    public List<Kep> findPopKeps() {
        return null;
    }

    @Override
    public long countKeps() {
        return 0;
    }

    @Override
    public boolean addKep(Kep kep) {
        return false;
    }
}
