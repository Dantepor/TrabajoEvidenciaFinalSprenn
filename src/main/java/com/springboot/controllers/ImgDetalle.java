package com.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/menu")
public class ImgDetalle {
	
	@GetMapping({"/detalle", "/det"})
	public String detalle() {
		return "detalle";
	}

}
