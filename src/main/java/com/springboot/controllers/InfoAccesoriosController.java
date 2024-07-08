package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.models.Accesorios;
import com.springboot.services.AccesoriosService;

@Controller
@RequestMapping("/accesorio")
public class InfoAccesoriosController {

    @Autowired
    private AccesoriosService accesoriosService;

    @GetMapping("/{id}")
    public String mostrarDetalle(@PathVariable Long id, Model model) {
        Accesorios accesorio = accesoriosService.obtenerPorId(id);
        model.addAttribute("accesorio", accesorio);
        return "detalleAccesorio"; // Nombre de la plantilla Thymeleaf para mostrar detalles de accesorios
    }
}