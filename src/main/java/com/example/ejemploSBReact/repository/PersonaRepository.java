package com.example.ejemploSBReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejemploSBReact.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
  // hereda los medotos de JpaRepository    
} 