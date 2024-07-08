package com.springboot.controllers;

import com.springboot.services.IProductoService;
import com.springboot.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class Menu1Controller {

    @Autowired
    private IProductoService productoService;

    // Endpoint para mostrar todos los productos
    @GetMapping({"/", "/home"})
    public String mostrarTodosLosProductos(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "menu1"; // Vista para mostrar todos los productos
    }
}