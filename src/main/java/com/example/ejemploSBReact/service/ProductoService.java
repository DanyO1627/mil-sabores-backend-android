package com.example.ejemploSBReact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemploSBReact.model.Producto;
import com.example.ejemploSBReact.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repo;

    public List<Producto> getAll() {
        return repo.findAll();
    }

    public Optional<Producto> getById(Long id) {
        return repo.findById(id);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Object findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Producto save(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Producto> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
