package com.springboot.controllers;

import com.springboot.services.IProductoService;
import com.springboot.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/pagination")
public class PaginationController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    public String listarProductosPaginados(Model model, @RequestParam(defaultValue = "1") int page) {
        int productsPerPage = 4; // Mostrar 4 productos por página

        // Obtener productos paginados
        List<Producto> productos = productoService.obtenerProductosPaginados(page, productsPerPage);

        // Calcular el número total de páginas
        int totalPages = (int) Math.ceil((double) productoService.contarProductos() / productsPerPage);

        // Agregar datos al modelo
        model.addAttribute("productos", productos);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        return "menu1"; // Nombre de la vista que muestra los productos paginados
    }
}