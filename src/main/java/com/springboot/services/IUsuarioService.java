package com.springboot.services;

import com.springboot.models.Usuario;

public interface IUsuarioService {
    void guardarUsuario(Usuario usuario);
    Usuario encontrarPorNombre(String nombre);
}