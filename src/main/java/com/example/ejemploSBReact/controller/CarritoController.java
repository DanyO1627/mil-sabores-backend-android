package com.example.ejemploSBReact.controller;

import com.example.ejemploSBReact.dto.*;
import com.example.ejemploSBReact.service.CarritoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carrito")
@CrossOrigin("*")
public class CarritoController {

    @Autowired
    private CarritoService service;

    @PostMapping
    public CarritoResponseDto crearCarrito() {
        return service.crearCarrito();
    }

    @GetMapping("/{id}")
    public CarritoResponseDto obtener(@PathVariable Long id) {
        return service.obtenerCarrito(id);
    }

    @PostMapping("/{id}/items")
    public CarritoResponseDto agregarItem(
            @PathVariable Long id,
            @RequestBody AgregarItemRequestDto req) {
        return service.agregarItem(id, req);
    }

    @PatchMapping("/{id}/items/{productoId}/disminuir")
    public CarritoResponseDto disminuir(
            @PathVariable Long id,
            @PathVariable Long productoId) {
        return service.disminuirItem(id, productoId);
    }

    @DeleteMapping("/{id}/items/{productoId}")
    public CarritoResponseDto eliminar(
            @PathVariable Long id,
            @PathVariable Long productoId) {
        return service.eliminarItem(id, productoId);
    }

    @DeleteMapping("/{id}")
    public CarritoResponseDto vaciar(@PathVariable Long id) {
        return service.vaciarCarrito(id);
    }

    @PostMapping("/{id}/confirmar")
    public CarritoResponseDto confirmar(@PathVariable Long id) {
        return service.confirmarCompra(id);
    }
}

