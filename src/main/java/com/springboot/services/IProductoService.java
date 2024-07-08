package com.springboot.services;

import com.springboot.models.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerPorId(Long id);
    List<Producto> obtenerProductosPaginados(int page, int productsPerPage);
    long contarProductos();
}