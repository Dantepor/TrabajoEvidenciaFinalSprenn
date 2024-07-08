package com.springboot.controllers;

import com.springboot.services.IConsolasService;
import com.springboot.models.Consolas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class Menu2Controller {

    @Autowired
    private IConsolasService consolasService;

    // Endpoint para mostrar todas las consolas
    @GetMapping({"/tercero", "/third"})
    public String mostrarTodasLasConsolas(Model model) {
        List<Consolas> consolas = consolasService.obtenerTodasLasConsolas();
        model.addAttribute("consolas", consolas);
        return "menu2"; // Vista para mostrar todas las consolas
    }
}