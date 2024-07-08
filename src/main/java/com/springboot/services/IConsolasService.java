package com.springboot.services;

import com.springboot.models.Consolas;

import java.util.List;

public interface IConsolasService {
    List<Consolas> obtenerTodasLasConsolas();
    Consolas obtenerPorId(Long id);
    List<Consolas> obtenerConsolasPaginadas(int page, int consolasPorPagina);
    long contarConsolas();
}