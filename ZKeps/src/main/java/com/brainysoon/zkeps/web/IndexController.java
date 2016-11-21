package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ken on 16-10-12.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private KepsService kepsService;

    @Autowired
    public void setKepsService(KepsService kepsService) {
        this.kepsService = kepsService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {


        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {

        return "about";
    }
}