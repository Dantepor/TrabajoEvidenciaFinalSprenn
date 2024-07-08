package com.springboot.services;

import com.springboot.models.Accesorios;
import com.springboot.repository.AccesoriosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccesoriosService implements IAccesoriosService {

    @Autowired
    private AccesoriosRepository accesoriosRepository;

    @Override
    public List<Accesorios> obtenerTodosLosAccesorios() {
        return accesoriosRepository.findAll();
    }

    @Override
    public Accesorios obtenerPorId(Long id) {
        return accesoriosRepository.findById(id).orElse(null);
    }

    @Override
    public List<Accesorios> obtenerAccesoriosPaginados(int page, int accesoriosPorPagina) {
        // Calcular el índice inicial de la página solicitada
        int startIndex = (page - 1) * accesoriosPorPagina;

        // Obtener accesorios paginados
        return accesoriosRepository.findAll(PageRequest.of(startIndex, accesoriosPorPagina)).getContent();
    }

    @Override
    public long contarAccesorios() {
        // Contar el número total de accesorios
        return accesoriosRepository.count();
    }
}