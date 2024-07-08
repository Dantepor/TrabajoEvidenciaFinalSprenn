package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class Menu5Controller {

    @GetMapping({"/sexto", "/sext"})
    public String menu5(Model model) {
        return "menu5";
    }
}