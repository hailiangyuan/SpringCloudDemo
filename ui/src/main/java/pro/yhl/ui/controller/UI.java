package pro.yhl.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author YuanHaiLiang
 * @date 2019-01-07
 * 前后端分离用 RestController  不分离的：Controller
 */
@Controller
public class UI {
    @GetMapping(value = "/login")
    public String index(Model model) {
        model.addAttribute("main", "main");

        return "login";
    }

    @GetMapping(value = "/")
    public String login(Model model) {
        model.addAttribute("main", "main");

        return "login";
    }
}


