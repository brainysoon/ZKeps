package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.DataConfig;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.dao.mock.MockKepsRepository;
import com.brainysoon.zkeps.utils.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class TestKepsController {

    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {
        this.kepsRepository = kepsRepository;
    }

    @Test
    public void testKepsController() throws Exception {

        KepsController kepsController = new KepsController();

        kepsController.setKepsRepository(new MockKepsRepository());

        MockMvc mockMvc = standaloneSetup(kepsController)
                .setViewResolvers(new WebConfig().viewResolver()).build();

        mockMvc.perform(get("/keps")).andExpect(view().name("keps"));

        mockMvc.perform(get("/keps/2")).andExpect(view().name("kep"));
    }

    @Test
    public void testKeps() throws Exception {

        KepsController kepsController = new KepsController();

        List<Kep> keps = createKeps(3, 20);

        KepsRepository kepsRepository = mock(KepsRepository.class);     //MockRepository

        when(kepsRepository.findKeps(3, 20)).thenReturn(keps);

        kepsController.setKepsRepository(kepsRepository);

        MockMvc mockMvc = standaloneSetup(kepsController)               //MockSpringMvc
                .setViewResolvers(new WebConfig().viewResolver()).build();

        mockMvc.perform(get("/keps?&max=3&count=20")).andExpect(view().name("keps"))    //SpringExpect
                .andExpect(model().attributeExists("keps"))
                .andExpect(model().attribute("keps", keps));
    }

    public List<Kep> createKeps(long max, long count) {

        List<Kep> keps = new ArrayList<>();

        for (long i = max; i <= max + count; i++) {

            keps.add(new Kep());
        }

        return keps;
    }

    @Test
    public void addKep() {

        Kep kep = new Kep();

        kep.setKepId(DateUtils.getInstance().getKepIdDateInfo());
        kep.setUserName("brainy");
        kep.setKepTime(new Date());
        kep.setKepTitle("test");
        kep.setKepMsg("test");
        kep.setKepContent("test");
        kep.setStars(0);

        kepsRepository.addKep(kep);

        assertEquals(1, kepsRepository.countKeps());
    }
}