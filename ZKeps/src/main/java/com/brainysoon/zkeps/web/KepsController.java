package com.brainysoon.zkeps.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by brainy on 16-11-22.
 */
@Controller
@RequestMapping(value = "/keps")
public class KepsController {

    @RequestMapping
    public String keps(Model model) {

        return "keps";
    }
}
