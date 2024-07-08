package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class Menu4Controller {

    @GetMapping({"/quinto", "/quin"})
    public String menu4(Model model) {
        return "menu4";
    }
}