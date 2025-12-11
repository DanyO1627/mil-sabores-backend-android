package com.example.ejemploSBReact.dto;

import lombok.Data;

@Data
public class CarritoItemDto {
    private Long productoId;
    private String nombreProducto;
    private Double precioUnitario;
    private Integer cantidad;
    private String imagenUrl;
}
