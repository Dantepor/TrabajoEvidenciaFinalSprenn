package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class SoporteController {

    @GetMapping({"/soporte", "/sopor"})
    public String soporte(Model model) {
        return "soporte";
    }
}