package com.springboot.services;

import com.springboot.models.Producto;
import com.springboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Producto> obtenerProductosPaginados(int page, int productsPerPage) {
        // Calcular el índice inicial de la página solicitada
        int startIndex = (page - 1) * productsPerPage;
        
        // Obtener productos paginados
        return productoRepository.findAll(PageRequest.of(startIndex, productsPerPage)).getContent();
    }

    @Override
    public long contarProductos() {
        // Contar el número total de productos
        return productoRepository.count();
    }
}