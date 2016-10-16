package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.data.KepsRepository;
import com.brainysoon.zkeps.data.MockKepsRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-13.
 */
public class TestKepsController {

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

            keps.add(new Kep(i, "第" + i + "条帖子", new Date(), "用户:" + i));
        }

        return keps;
    }
}