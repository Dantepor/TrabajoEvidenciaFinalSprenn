package com.springboot.services;

import org.springframework.stereotype.Service;

import com.springboot.models.Tarjeta;

@Service
public interface ITarjetaService {

	public String obtenerTarjeta(Tarjeta tarjeta);
}
