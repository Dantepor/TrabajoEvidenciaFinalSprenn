package com.springboot.services;

import com.springboot.models.Consolas;
import com.springboot.repository.ConsolasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsolasService implements IConsolasService {

    @Autowired
    private ConsolasRepository consolasRepository;

    @Override
    public List<Consolas> obtenerTodasLasConsolas() {
        return consolasRepository.findAll();
    }

    @Override
    public Consolas obtenerPorId(Long id) {
        return consolasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Consolas> obtenerConsolasPaginadas(int page, int consolasPorPagina) {
        // Calcular el índice inicial de la página solicitada
        int startIndex = (page - 1) * consolasPorPagina;

        // Obtener consolas paginadas
        return consolasRepository.findAll(PageRequest.of(startIndex, consolasPorPagina)).getContent();
    }

    @Override
    public long contarConsolas() {
        // Contar el número total de consolas
        return consolasRepository.count();
    }

}