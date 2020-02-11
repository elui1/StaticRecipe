package com.eric.staticrecipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/bananabread")
    public String bananaBread() {
        return "bananabread";
    }

    @RequestMapping("/omelette")
    public String omelette() {
        return "omelette";
    }

    @RequestMapping("/listrecipes")
    public String listrecipes() {
        return "listrecipes";
    }
}
