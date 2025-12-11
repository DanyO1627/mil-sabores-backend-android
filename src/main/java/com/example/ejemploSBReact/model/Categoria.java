package com.example.ejemploSBReact.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Entity
@Table(name = "categorias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;


    @JsonProperty("nombreCategoria")
    @Column(name = "nombre_categoria", nullable = false, length = 100)
    private String nombreCategoria;


    @JsonProperty("descripcionCategoria")
    @Column(name = "descripcion_categoria", nullable = true, length = 255)
    private String descripcionCategoria;


    @Column(name = "imagen_url", nullable = true, length = 255)
    private String imagenUrl;


    @Column(nullable = true)
    private Boolean activo;
   
}
