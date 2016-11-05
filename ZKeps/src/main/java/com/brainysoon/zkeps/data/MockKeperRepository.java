package com.brainysoon.zkeps.data;

import com.brainysoon.zkeps.bean.Keper;
import org.springframework.stereotype.Repository;

/**
 * Created by ken on 16-10-14.
 */
@Repository
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
}
