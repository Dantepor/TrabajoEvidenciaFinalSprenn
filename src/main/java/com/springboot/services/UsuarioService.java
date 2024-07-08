package com.springboot.services;

import com.springboot.models.Usuario;
import com.springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario encontrarPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
}