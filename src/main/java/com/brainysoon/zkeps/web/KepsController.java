package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.data.KepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ken on 16-10-13.
 */
@Controller
@RequestMapping("/keps")
public class KepsController {

    private KepsRepository kepsRepository;

    @Autowired
    public void setKepsRepository(KepsRepository kepsRepository) {

        this.kepsRepository = kepsRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String keps(@RequestParam(value = "max", defaultValue = "1") long max,
                       @RequestParam(value = "count", defaultValue = "20") long count,
                       Model model) {

        model.addAttribute("keps", kepsRepository.findKeps(max, count));

        return "keps";
    }
}
