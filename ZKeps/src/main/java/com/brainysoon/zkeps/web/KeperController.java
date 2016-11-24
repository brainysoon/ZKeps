package com.brainysoon.zkeps.web;

import com.brainysoon.zkeps.service.KeperService;
import com.brainysoon.zkeps.service.KepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brainy on 16-11-22.
 */
@Controller
@RequestMapping()
@SessionAttributes("keper")
public class KeperController {

    private KeperService keperService;
    private KepsService kepsService;

    @Autowired
    public void setKepsService(KepsService kepsService) {
        this.kepsService = kepsService;
    }

    @Autowired
    public void setKeperService(KeperService keperService) {
        this.keperService = keperService;
    }

    @RequestMapping(value = "/kepers", method = RequestMethod.GET)
    public String kepers(Model model) {

        model.addAttribute("kepers", keperService.findAllKepers());

        return "kepers";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addKepers(Model model,
                            @RequestParam(value = "keperName") String keperName,
                            @RequestParam(value = "password") String password,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "nickName") String nickName,
                            @RequestParam(value = "motto") String motto) {

        if (keperName == null || password == null || email == null ||
                keperName.equals("") || password.equals("") || email.equals("")) {

            model.addAttribute("codeStr", "未按照要求填写参数！");
            return "kepers";
        }

        int code = keperService.addKeper(keperName, password, email, nickName, motto);

        if (code > 0) {

            model.addAttribute("keper", keperService.findKeperByKeperName(keperName));

            return "redirect:/kepers/" + keperName;
        } else {

            model.addAttribute("codeStr", "添加失败，服务器内部错误！");

            return "register";
        }
    }

    @RequestMapping(value = "/kepers/{keperName}", method = RequestMethod.GET)
    public String keper(Model model, @PathVariable("keperName") String keperName) {

        model.addAttribute("showkeper", keperService.findKeperByKeperName(keperName));
        model.addAttribute("keps", kepsService.findKepsByKeperName(keperName));

        return "profile";
    }
}
