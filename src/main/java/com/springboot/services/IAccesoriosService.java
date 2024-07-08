package com.springboot.services;

import com.springboot.models.Accesorios;

import java.util.List;

public interface IAccesoriosService {
    List<Accesorios> obtenerTodosLosAccesorios();
    Accesorios obtenerPorId(Long id);
    List<Accesorios> obtenerAccesoriosPaginados(int page, int accesoriosPorPagina);
    long contarAccesorios();
}