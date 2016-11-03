package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.data.MockKeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ken on 16-10-14.
 */
@Controller
@RequestMapping("/keper")
public class KeperController {

    private MockKeperRepository keperRepository;

    @Autowired
    public void setKeperRepository(MockKeperRepository keperRepository) {
        this.keperRepository = keperRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister(Keper keper) {

        if (keperRepository.processRegister(keper)) {

            return "redirect:/keper/" + keper.getUserName();
        } else {

            return "register";
        }
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String keper(@PathVariable(value = "userName") String userName,
                        Model model) {

        model.addAttribute("keper", keperRepository.findKeper(userName));

        return "profile";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(@RequestParam(value = "userName", defaultValue = "null") String userName,
                               @RequestParam(value = "password", defaultValue = "null") String password) {

        return "redirect:/keper/" + userName;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }
}
