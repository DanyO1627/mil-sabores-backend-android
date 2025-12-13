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


    // clave en BD = contraseña
    @Column(name = "clave")
    private String clave;

    private String region;
    private String comuna;
    

    public Usuario() {}

    public Usuario(String nombre, String email, String clave,
                   String region, String comuna
                   ) {

        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.region = region;
        this.comuna = comuna;
    }

    // GETTERS Y SETTERS (te los dejo completos)

    public Long getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

}
