package com.example.ejemploSBReact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemploSBReact.model.Categoria;
import com.example.ejemploSBReact.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Obtener todas las categorías
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    // Obtener categoría por ID
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}