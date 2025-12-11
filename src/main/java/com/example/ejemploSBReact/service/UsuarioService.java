package com.example.ejemploSBReact.service;

import org.springframework.stereotype.Service;
import com.example.ejemploSBReact.model.Usuario;
import com.example.ejemploSBReact.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> obtenerUsuarios() {
        return repository.findAll();
    }

    public Optional<Usuario> obtenerPorEmail(String email) {
        return repository.findByEmail(email);
    }

    public Usuario crearUsuario(Usuario usuario) {
        return repository.save(usuario);
    }
}
