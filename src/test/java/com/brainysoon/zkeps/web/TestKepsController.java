package com.brainysoon.zkeps.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-13.
 */
public class TestKepsController {

    @Test
    public void testKepsController() throws Exception {

        KepsController kepsController = new KepsController();

        MockMvc mockMvc = standaloneSetup(kepsController)
                .setViewResolvers(new WebConfig().viewResolver()).build();

        mockMvc.perform(get("/keps")).andExpect(view().name("keps"));
    }
}