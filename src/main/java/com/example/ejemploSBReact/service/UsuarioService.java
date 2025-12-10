package com.example.ejemploSBReact.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ejemploSBReact.model.Usuario;
import com.example.ejemploSBReact.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> obtenerUsuarios() {
        return repository.findAll();
    }

    public Optional<Usuario> obtenerPorCorreo(String correo) {
        return repository.findByCorreo(correo);
    }

    public Usuario crearUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario actualizarUsuario(Long id, Usuario nuevo) {
        return repository.findById(id)
                .map(u -> {
                    u.setNombre(nuevo.getNombre());
                    u.setCorreo(nuevo.getCorreo());
                    u.setPassword(nuevo.getPassword());
                    u.setEdad(nuevo.getEdad());
                    u.setTelefono(nuevo.getTelefono());
                    u.setDireccion(nuevo.getDireccion());
                    return repository.save(u);
                })
                .orElse(null);
    }

    public boolean eliminarUsuario(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
