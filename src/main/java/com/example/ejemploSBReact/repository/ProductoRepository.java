package com.example.ejemploSBReact.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejemploSBReact.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
