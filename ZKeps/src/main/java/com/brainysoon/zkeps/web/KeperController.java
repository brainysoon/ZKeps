package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.data.MockKeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by ken on 16-10-14.
 */
@Controller
public class KeperController {

    private MockKeperRepository keperRepository;

    @Autowired
    public void setKeperRepository(MockKeperRepository keperRepository) {
        this.keperRepository = keperRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {

        model.addAttribute(new Keper());

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister(Keper keper, Errors errors) {

        if (errors.hasErrors()) {

            return "register";
        }

        if (keperRepository.processRegister(keper)) {

            return "redirect:/keper/" + keper.getUserName();
        } else {

            return "register";
        }
    }

    @RequestMapping(value = "/keper/{userName}", method = RequestMethod.GET)
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

    @RequestMapping(value = "/detailRegister", method = RequestMethod.POST)
    public String detailRegister(@RequestPart("avator") MultipartFile avator,
                                 @RequestParam(value = "nickName", defaultValue = "keper") String nickName,
                                 @RequestParam(value = "motto", defaultValue = "i good man") String motto) {

        try {
            avator.transferTo(
                    new File("/var/local/avators/" + avator.getOriginalFilename())
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "index";
    }

    @RequestMapping(value = "/detailRegister", method = RequestMethod.GET)
    public String showDetailRegister() {

        return "detailRegister";
    }
}
