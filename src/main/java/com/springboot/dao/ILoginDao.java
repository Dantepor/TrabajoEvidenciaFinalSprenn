package com.springboot.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.Usuario;


@Repository
public interface ILoginDao extends CrudRepository<Usuario, Integer>{
	
Usuario findByNombre(String nombre);

}
