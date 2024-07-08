package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prueba1")
public class Prueba1Controller {

    @GetMapping({"/hola", "/hi"})
    public String prueba1(Model model) {
        return "prueba1";
    }
}