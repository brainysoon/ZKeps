package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.dao.DataConfig;
import com.brainysoon.zkeps.dao.KepsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class TestIndexController {

    @Autowired
    private KepsRepository kepsRepository;

    @Test
    public void testIndexController() throws Exception {

        IndexController indexController = new IndexController();

        indexController.setKepsRepository(kepsRepository);

        MockMvc mockMvc = standaloneSetup(indexController).build();

        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
