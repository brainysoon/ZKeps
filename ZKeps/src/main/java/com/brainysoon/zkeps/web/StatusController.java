package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.service.StatusService;
import com.brainysoon.zkeps.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Created by brainy on 16-11-22.
 */
@Controller
@SessionAttributes("keper")
public class StatusController {

    private StatusService statusService;

    @Autowired
    public void setStatusService(StatusService statusService) {
        this.statusService = statusService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String beforeLogin(Model model) {

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model,
                        @RequestParam(value = "keperName", defaultValue = "null") String keperName,
                        @RequestParam(value = "password", defaultValue = "null") String password) {

        int code = statusService.processLogin(keperName, password);

        if (CodeUtils.getInstance().parserCodeToBoolean(code)) {

            model.addAttribute("keper", statusService.findKeperByKeperName(keperName));

            return "redirect:/";
        } else {

            model.addAttribute("code", code);
            model.addAttribute("codeStr", CodeUtils.getInstance().parserCodeToString(code));

            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus) {

        sessionStatus.setComplete();

        return "redirect:/";
    }
}
