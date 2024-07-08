package com.springboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.models.Producto;
import com.springboot.services.IProductoService;



@Controller
@RequestMapping("/producto")
public class InfoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/{id}")
    public String mostrarDetalle(@PathVariable Long id, Model model) {
        Producto producto = productoService.obtenerPorId(id);
        model.addAttribute("producto", producto);
        return "detalleProducto"; // Nombre de la plantilla Thymeleaf para mostrar detalles
    }
}