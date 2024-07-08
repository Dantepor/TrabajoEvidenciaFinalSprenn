package com.springboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.models.Tarjeta;
import com.springboot.services.ITarjetaService;


@Controller
@RequestMapping("/pago")
public class PagoController {
	
	@Autowired
	private ITarjetaService _tarjetaService;

	@GetMapping({"/producto1", "/primer1"})
	public String pago(Model model) {		
		Tarjeta tarjeta = new Tarjeta();
		model.addAttribute("tarjeta",tarjeta);
		return "pago";
	}
	
	@PostMapping("/tarjeta")
	public String pago(Tarjeta tarjeta,Model model) {
		Tarjeta newTarjeta = new Tarjeta();
		model.addAttribute("tarjeta",newTarjeta);
		return _tarjetaService.obtenerTarjeta(tarjeta);
	}
}
