package com.springboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.dao.ILoginDao;
import com.springboot.interfaces.ILoginRepository;
import com.springboot.models.Usuario;


@Repository
public class LoginRepository implements ILoginRepository {
	
	@Autowired
	private ILoginDao loginRepository;
	
	@Override
	public Usuario obtenerUsuario(String nombre) {
		return loginRepository.findByNombre(nombre);
	}

}
