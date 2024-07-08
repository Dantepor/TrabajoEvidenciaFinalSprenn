package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.interfaces.ITarjetaRepository;
import com.springboot.models.Tarjeta;

@Service
public class TarjetaService implements ITarjetaService{

	@Autowired
	private ITarjetaRepository tarjetaRepository;
	
	@Override
	public String obtenerTarjeta(Tarjeta tarjeta) {
		
		String responseView = "pago";
		
		Tarjeta _tarjeta = tarjetaRepository.obtenerTarjeta(tarjeta.getNumeroTarjeta());
		
		if (_tarjeta !=null) {
			if (tarjeta.getNumeroTarjeta().equals(_tarjeta.getNumeroTarjeta())) {
				responseView = "prueba1";
			}
		}else {
			return responseView;
		}
		
		return responseView;
	}
}
