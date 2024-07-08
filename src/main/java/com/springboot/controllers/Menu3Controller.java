package com.springboot.controllers;

import com.springboot.models.Accesorios;
import com.springboot.services.IAccesoriosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class Menu3Controller {

    @Autowired
    private IAccesoriosService accesoriosService;

    // Endpoint para mostrar todos los accesorios
    @GetMapping({"/cuarto", "/cuar"})
    public String mostrarTodosLosAccesorios(Model model) {
        List<Accesorios> accesorios = accesoriosService.obtenerTodosLosAccesorios();
        model.addAttribute("accesorios", accesorios);
        return "menu3"; // Vista para mostrar todos los accesorios
    }
}