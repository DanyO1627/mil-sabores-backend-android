package com.example.ejemploSBReact.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "email")
    private String email;

    private Integer edad;

    // clave en BD = contraseña
    @Column(name = "clave")
    private String clave;

    private String region;
    private String comuna;
    private String estado;
    private String rol;
    private String categoria;
    private String fecha;

    public Usuario() {}

    public Usuario(String nombre, String email, Integer edad, String clave,
                   String region, String comuna, String estado, String rol,
                   String categoria, String fecha) {

        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.clave = clave;
        this.region = region;
        this.comuna = comuna;
        this.estado = estado;
        this.rol = rol;
        this.categoria = categoria;
        this.fecha = fecha;
    }

    // GETTERS Y SETTERS (te los dejo completos)

    public Long getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
