package com.springboot.services;

import org.springframework.stereotype.Service;

import com.springboot.models.Usuario;

@Service
public interface ILoginService {
	
	public String obtenerUsuario(Usuario nombre);
}
