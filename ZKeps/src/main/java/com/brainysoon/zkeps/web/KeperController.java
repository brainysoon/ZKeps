package com.brainysoon.zkeps.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by brainy on 16-11-22.
 */
@Controller
@RequestMapping(value = "/kepers")
public class KeperController {

    @RequestMapping
    public String kepers() {

        return "kepers";
    }
}
