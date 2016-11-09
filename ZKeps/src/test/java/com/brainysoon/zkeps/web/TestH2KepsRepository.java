package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.DataConfig;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.utils.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by brainy on 16-11-8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class TestH2KepsRepository {

    private long id;

    @Autowired
    private KepsRepository kepsRepository;

    @Test
    public void testFindOne() {

        testInsertOne();

        Kep kep = kepsRepository.findOne(id);

        assertNotNull(kep);
    }

    @Test
    public void testInsertOne() {

        id = (new Date().getTime()) % Integer.MAX_VALUE;

        Kep kep = new Kep();

        kep.setKepId(DateUtils.getInstance().getKepIdDateInfo());
        kep.setUserName("brainy");
        kep.setKepMsg("brainysoon");
        kep.setKepTitle("brainyNot");
        kep.setKepContent("not thing");
        kep.setKepTime(new Date());
        kep.setStars(0);

        kepsRepository.addKep(kep);

        assertEquals(1, kepsRepository.countKeps());

    }

    @Test
    public void testFindPopKeps() {

        testInsertOne();

        List<Kep> keps = kepsRepository.findPopKeps();

        assertEquals(1, keps.size());
    }
}
