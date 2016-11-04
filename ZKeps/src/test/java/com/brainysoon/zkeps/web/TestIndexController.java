package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.data.MockKepsRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-12.
 */
public class TestIndexController {

    @Test
    public void testIndexController() throws Exception {

        IndexController indexController = new IndexController();

        indexController.setKepsRepository(new MockKepsRepository());

        MockMvc mockMvc = standaloneSetup(indexController).build();

        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
