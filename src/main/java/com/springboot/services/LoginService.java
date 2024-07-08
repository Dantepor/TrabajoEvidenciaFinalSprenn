package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.interfaces.ILoginRepository;
import com.springboot.models.Usuario;

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	public ILoginRepository _loginRepository;
	
	@Override
	public String obtenerUsuario(Usuario username) {
		
		String responseView = "login";
		
		Usuario _login = _loginRepository.obtenerUsuario(username.getNombre());
		
		if (_login !=null) {
			if (username.getContraseña().equals(_login.getContraseña())){
				responseView = "prueba1";
			}
		}else {
			return responseView;
		}
		
		return responseView;
	}

}