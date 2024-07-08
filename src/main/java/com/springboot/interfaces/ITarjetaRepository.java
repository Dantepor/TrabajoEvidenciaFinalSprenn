package com.springboot.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.models.Tarjeta;

@Repository
public interface ITarjetaRepository {

	@Autowired
	Tarjeta obtenerTarjeta(String tarjeta);
}
