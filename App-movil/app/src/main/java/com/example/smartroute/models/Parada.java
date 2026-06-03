package com.example.smartroute.models;

import java.io.Serializable;

public class Parada implements Serializable {

    private Long id;

    private String nombre;

    private Double latitud;

    private Double longitud;
    private Estado estado;

    public enum Estado {
        en_reparto,
        incidencia,
        entregado
    };

    public Parada() {}

    public Parada(Long id, String nombre, Double latitud, Double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
