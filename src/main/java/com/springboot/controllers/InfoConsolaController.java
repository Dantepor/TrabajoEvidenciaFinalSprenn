package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.models.Consolas;
import com.springboot.services.ConsolasService;

@Controller
@RequestMapping("/consola")
public class InfoConsolaController {

    @Autowired
    private ConsolasService consolaService;

    @GetMapping("/{id}")
    public String mostrarDetalle(@PathVariable Long id, Model model) {
        Consolas consola = consolaService.obtenerPorId(id);
        model.addAttribute("consolas", consola);
        return "detalleConsola"; // Nombre de la plantilla Thymeleaf para mostrar detalles de consola
    }
}