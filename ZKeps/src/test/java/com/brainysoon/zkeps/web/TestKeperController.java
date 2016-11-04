package com.brainysoon.zkeps.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ken on 16-10-14.
 */
public class TestKeperController {

    private KeperController keperController = new KeperController();

    @Test
    public void testKeper() throws Exception {

        MockMvc mockMvc = standaloneSetup(keperController)
                .setViewResolvers(new WebConfig().viewResolver()).build();

        mockMvc.perform(get("/register")).andExpect(view().name("register"));
    }
}
