package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.config.RootConfig;
import com.brainysoon.zkeps.service.KepsService;
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
 * Created by brainy on 16-11-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, WebConfig.class})
public class TestIndexController {

    private KepsService kepsService;

    @Autowired
    public void setKepsService(KepsService kepsService) {
        this.kepsService = kepsService;
    }

    @Test
    public void testIndex() throws Exception {

        IndexController indexController = new IndexController();

        MockMvc mockMvc = standaloneSetup(indexController).build();

        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
