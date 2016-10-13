package com.brainysoon.zkeps.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ken on 16-10-12.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private String x = "";

    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        return "index";
    }
}