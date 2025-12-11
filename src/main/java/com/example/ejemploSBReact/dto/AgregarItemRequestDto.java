package com.example.ejemploSBReact.dto;

import lombok.Data;

@Data
public class AgregarItemRequestDto {
    private Long productoId;
    private Integer cantidad;
}

