package com.springboot.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.models.Usuario;

@Repository
public interface ILoginRepository {
	
	@Autowired
	Usuario obtenerUsuario(String nombre);

}
