package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.dao.KepsRepository;
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

    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {

        this.kepsRepository = kepsRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("popKeps", kepsRepository.findPopKeps());

        return "index";
    }
}