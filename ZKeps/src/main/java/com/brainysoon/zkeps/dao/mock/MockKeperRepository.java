package com.brainysoon.zkeps.dao.mock;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.KeperRepository;

/**
 * Created by ken on 16-10-14.
 */
//@Repository
public class MockKeperRepository implements KeperRepository {

    @Override
    public boolean processRegister(Keper keper) {
        return true;
    }

    @Override
    public Keper findKeper(String userName) {
        Keper keper = new Keper();

        keper.setUserName(userName);

        return keper;
    }

    @Override
    public long countUser() {
        return 0;
    }
}
