package com.example.ejemploSBReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejemploSBReact.model.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}
