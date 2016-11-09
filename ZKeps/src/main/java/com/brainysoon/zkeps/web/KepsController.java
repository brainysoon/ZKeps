package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;
import com.brainysoon.zkeps.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

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

    @RequestMapping(value = "/{kepId}", method = RequestMethod.GET)
    public String kep(@PathVariable(value = "kepId") long kepId,
                      Model model) {

        model.addAttribute("kep", kepsRepository.findOne(kepId));

        return "kep";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addKep(@RequestParam(value = "kepTitle", defaultValue = "unname") String kepTitle,
                         @RequestParam(value = "kepMsg", defaultValue = "unmsg") String kepMsg,
                         @RequestParam(value = "kepContent", defaultValue = "uncontent") String kepContent) {

        Kep kep = new Kep();

        long id = (new Date().getTime()) % Integer.MAX_VALUE;

        kep.setKepId(DateUtils.getInstance().getKepIdDateInfo());
        kep.setUserName("brainy");
        kep.setKepTime(new Date());
        kep.setKepTitle(kepTitle);
        kep.setKepMsg(kepMsg);
        kep.setKepContent(kepContent);
        kep.setStars(0);

        kepsRepository.addKep(kep);

        return "redirect:/keps/" + id;
    }
}
