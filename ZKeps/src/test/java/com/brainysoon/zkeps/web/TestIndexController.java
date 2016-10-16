package com.brainysoon.zkeps.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        MockMvc mockMvc = standaloneSetup(indexController).setViewResolvers(resolver).build();

        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
