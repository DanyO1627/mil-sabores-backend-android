package com.example.ejemploSBReact.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemploSBReact.model.Usuario;
import com.example.ejemploSBReact.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*") // Permitir acceso desde Android
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    // GET: listar todos
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return service.obtenerUsuarios();
    }

    // GET: buscar por correo
    @GetMapping("/{correo}")
    public Optional<Usuario> buscarPorCorreo(@PathVariable String correo) {
        return service.obtenerPorCorreo(correo);
    }

    // POST: registrar usuario
    @PostMapping
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return service.crearUsuario(usuario);
    }

}
