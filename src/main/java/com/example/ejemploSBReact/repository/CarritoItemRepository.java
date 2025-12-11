package com.example.ejemploSBReact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejemploSBReact.model.CarritoItem;

public interface CarritoItemRepository extends JpaRepository<CarritoItem, Long> {

    List<CarritoItem> findByCarrito_Id(Long carritoId);
}
