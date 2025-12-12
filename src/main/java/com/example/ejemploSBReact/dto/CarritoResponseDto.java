package com.example.ejemploSBReact.dto;

import java.util.List;

import lombok.Data;

@Data
public class CarritoResponseDto {
    private Long carritoId;
    private List<CarritoItemDto> items;
    private Double total;
}