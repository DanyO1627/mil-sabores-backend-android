package com.example.ejemploSBReact.service;

import com.example.ejemploSBReact.model.Carrito;
import com.example.ejemploSBReact.model.CarritoItem;
import com.example.ejemploSBReact.model.Producto;

import com.example.ejemploSBReact.repository.CarritoRepository;
import com.example.ejemploSBReact.repository.CarritoItemRepository;
import com.example.ejemploSBReact.repository.ProductoRepository;

import com.example.ejemploSBReact.dto.CarritoResponseDto;
import com.example.ejemploSBReact.dto.CarritoItemDto;
import com.example.ejemploSBReact.dto.AgregarItemRequestDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepo;

    @Autowired
    private CarritoItemRepository itemRep;

    @Autowired
    private ProductoRepository productoRepo;

    public CarritoResponseDto crearCarrito() {
        Carrito c = new Carrito();
        c.setConfirmado(false);
        carritoRepo.save(c);
        return mapToResponse(c);
    }

    public CarritoResponseDto obtenerCarrito(Long carritoId) {
        Carrito c = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));
        return mapToResponse(c);
    }

    public CarritoResponseDto agregarItem(Long carritoId, AgregarItemRequestDto req) {

        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        Producto producto = productoRepo.findById(req.getProductoId())
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        if (producto.getStock() < req.getCantidad()) {
            throw new RuntimeException("Stock insuficiente");
        }

        Optional<CarritoItem> existenteOpt = carrito.getItems().stream()
                .filter(i -> i.getProductoId().equals(req.getProductoId()))
                .findFirst();

        if (existenteOpt.isPresent()) {
            CarritoItem item = existenteOpt.get();
            int nuevaCantidad = item.getCantidad() + req.getCantidad();

            if (producto.getStock() < nuevaCantidad) {
                throw new RuntimeException("No hay stock para aumentar");
            }

            item.setCantidad(nuevaCantidad);
        } else {
            CarritoItem nuevo = new CarritoItem();
            nuevo.setProductoId(producto.getId());
            nuevo.setNombreProducto(producto.getNombreProducto());
            nuevo.setPrecioUnitario(producto.getPrecio());
            nuevo.setCantidad(req.getCantidad());
            nuevo.setImagenUrl(producto.getImagenUrl());
            nuevo.setCarrito(carrito);
            carrito.getItems().add(nuevo);
        }

        carritoRepo.save(carrito);
        return mapToResponse(carrito);
    }

    public CarritoResponseDto disminuirItem(Long carritoId, Long productoId) {
        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        CarritoItem item = carrito.getItems().stream()
                .filter(i -> i.getProductoId().equals(productoId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item no encontrado"));

        int nueva = item.getCantidad() - 1;

        if (nueva <= 0) {
            carrito.getItems().remove(item);
        } else {
            item.setCantidad(nueva);
        }

        carritoRepo.save(carrito);
        return mapToResponse(carrito);
    }

    public CarritoResponseDto eliminarItem(Long carritoId, Long productoId) {
        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        carrito.getItems().removeIf(i -> i.getProductoId().equals(productoId));

        carritoRepo.save(carrito);
        return mapToResponse(carrito);
    }

    public CarritoResponseDto vaciarCarrito(Long carritoId) {
        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        carrito.getItems().clear();
        carritoRepo.save(carrito);

        return mapToResponse(carrito);
    }

    public CarritoResponseDto confirmarCompra(Long carritoId) {
        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        carrito.setConfirmado(true);
        carritoRepo.save(carrito);

        return mapToResponse(carrito);
    }

    private CarritoResponseDto mapToResponse(Carrito carrito) {
        CarritoResponseDto dto = new CarritoResponseDto();

        dto.setCarritoId(carrito.getId());

        var itemsDto = carrito.getItems().stream().map(item -> {
            CarritoItemDto i = new CarritoItemDto();
            i.setProductoId(item.getProductoId());
            i.setNombreProducto(item.getNombreProducto());
            i.setPrecioUnitario(item.getPrecioUnitario());
            i.setCantidad(item.getCantidad());
            i.setImagenUrl(item.getImagenUrl());
            return i;
        }).collect(Collectors.toList());

        dto.setItems(itemsDto);

        double total = itemsDto.stream()
                .mapToDouble(i -> i.getPrecioUnitario() * i.getCantidad())
                .sum();

        dto.setTotal(total);
        return dto;
    }
}

