package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.models.Usuario;
import com.springboot.services.ILoginService;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/proyecto")
public class LoginController {
	
	@Autowired
	private ILoginService _loginService;

	@GetMapping({"/login", "/entrar"})
	public String login(Model model) {
		Usuario nombre = new Usuario();
		model.addAttribute("nombre", nombre);
		return "login";
	}
	@PostMapping("/Inicio")
	public String Auth(Usuario username, Model model) {
		
		Usuario userNew = new Usuario();
		
		model.addAttribute("nombre",userNew);
		
		return _loginService.obtenerUsuario(username);
	}
}