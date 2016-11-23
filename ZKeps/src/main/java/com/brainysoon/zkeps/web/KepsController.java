package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by brainy on 16-11-22.
 */
@Controller
@RequestMapping(value = "/keps")
public class KepsController {

    private KepsService kepsService;

    @Autowired
    public void setKepsService(KepsService kepsService) {
        this.kepsService = kepsService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String keps(Model model, HttpSession httpSession) {

        Keper keper = (Keper) httpSession.getAttribute("keper");

        if (keper == null) {

            model.addAttribute("codeStr", "用户没有登录,登录后可发帖！");
        } else {

            model.addAttribute("keps", kepsService.findKepsByKeperName(keper.getKeperName()));
        }

        return "keps";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addKeps(Model model, HttpSession httpSession,
                          @RequestParam(value = "kepTitle", defaultValue = "UnTitle") String kepTitle,
                          @RequestParam(value = "kepMsg", defaultValue = "UnMsg") String kepMsg,
                          @RequestParam(value = "kepContent", defaultValue = "UnContent") String kepContent) {

        Keper keper = (Keper) httpSession.getAttribute("keper");

        if (keper == null) {

            model.addAttribute("codeStr", "用户没有登录,登录后可发帖！");
        } else {

            int code = kepsService.addKeps(keper, kepTitle, kepMsg, kepContent);

            model.addAttribute("keps", kepsService.findKepsByKeperName(keper.getKeperName()));
        }

        return "keps";
    }
}
