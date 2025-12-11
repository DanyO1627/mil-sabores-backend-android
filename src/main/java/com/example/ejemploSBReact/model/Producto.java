package com.example.ejemploSBReact.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;


    @Column (nullable=false, length = 100)
    private String nombreProducto;


    @Column(nullable = false)
    private Double precio;


    @Column(name = "imagen_url", nullable = false)
    private String imagenUrl;


    @Column (nullable=false, length=280)
    private String descripcionProducto;


    @Column (nullable=false, length=400)
    private String descripcionLarga;


    @Column(nullable = true)
    private Boolean activo;


    @Column(nullable = false, precision = 2)
    private Integer stock;


    @ManyToOne
    @JoinColumn(name="id_categoria", nullable = true)
    private Categoria categoria;
}
