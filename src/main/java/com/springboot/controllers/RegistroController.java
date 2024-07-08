package com.springboot.controllers;

import com.springboot.models.Usuario;
import com.springboot.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proyecto")
public class RegistroController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping({"/registro", "/nuevo"})
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro"; // Nombre del template Thymeleaf (registro.html)
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        // Verifica si el nombre de usuario ya existe
        if (usuarioService.encontrarPorNombre(usuario.getNombre()) != null) {
            // Aquí puedes manejar el caso donde el nombre de usuario ya existe
            return "registro";
        }

        // Guarda el usuario en la base de datos
        usuarioService.guardarUsuario(usuario);

        // Redirige a la página de login o a donde prefieras
        return "menu1";
    }
}