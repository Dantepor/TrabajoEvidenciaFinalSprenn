package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingreso")
public class PerfilController {

    @GetMapping({"/perfil", "/persona"})
    public String perfil(Model model) {
        return "perfil";
    }
}