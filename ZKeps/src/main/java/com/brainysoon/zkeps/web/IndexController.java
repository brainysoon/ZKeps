package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String index(Model model, @RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex) {

        model.addAttribute("popKeps", kepsService.showPopKeps(pageIndex));

        int pageMax = kepsService.getPopKepsPageMax();

        model.addAttribute("pageMax", pageMax);
        if (pageIndex > 0) {
            model.addAttribute("preIndex", pageIndex - 1);
        } else {
            model.addAttribute("preIndex", pageIndex);
        }

        if (pageIndex >= pageMax) {
            model.addAttribute("subIndex", pageIndex);
        } else {
            model.addAttribute("subIndex", pageIndex + 1);
        }

        model.addAttribute("pageIndex", pageIndex);

        return "index";
    }

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about() {

        return "about";
    }
}