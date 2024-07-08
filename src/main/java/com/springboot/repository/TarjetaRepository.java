package com.springboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.dao.ITarjetaDao;
import com.springboot.interfaces.ITarjetaRepository;
import com.springboot.models.Tarjeta;

@Repository
public class TarjetaRepository implements ITarjetaRepository {

	@Autowired
	private ITarjetaDao tarjetaDao;
	
	@Override
	public Tarjeta obtenerTarjeta(String tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaDao.findByNumeroTarjeta(tarjeta);
	}

}
