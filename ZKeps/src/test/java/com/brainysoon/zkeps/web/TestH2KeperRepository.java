package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.data.DataConfig;
import com.brainysoon.zkeps.data.KeperRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by brainy on 16-11-7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class})
public class TestH2KeperRepository {

    @Autowired
    private KeperRepository keperRepository;

    @Test
    public void testCount() {

        assertEquals(0, keperRepository.countUser());
    }

    @Test
    public void testFindByUserName() {

        testInsertOne();

        String userName = "brainy";

        Keper keper = keperRepository.findKeper(userName);

        assertNotNull(keper);
    }

    @Test
    public void testInsertOne() {

        Keper keper = new Keper();
        keper.setUserName("brainy");
        keper.setPassword("bs19940115");
        keper.setEmail("brainysoon@163.com");
        keper.setNickName("brainy");
        keper.setMotto("oh my girl!");
        keper.setAvator("/var/local/avators/brainy.jpg");
        keper.setStars(10);
        keper.setSlead(1);

        keperRepository.processRegister(keper);

        assertEquals(1, keperRepository.countUser());
    }
}
