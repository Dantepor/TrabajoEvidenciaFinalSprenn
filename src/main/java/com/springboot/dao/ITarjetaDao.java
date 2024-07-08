package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.Tarjeta;

@Repository
public interface ITarjetaDao extends CrudRepository<Tarjeta, Integer> {

	Tarjeta findByNumeroTarjeta(String numeroTarjeta);
}
