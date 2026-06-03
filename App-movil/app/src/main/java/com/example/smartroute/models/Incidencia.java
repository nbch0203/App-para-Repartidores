package com.example.smartroute.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Incidencia implements Serializable {

    private Long id;
    private String tipo;
    private String descripcion;

    private Long paradaID;
    public Incidencia() {
        // Constructor vacío para la deserialización
    }

    public Incidencia(Long id, String tipo, String descripcion,Long paradaID) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.paradaID = paradaID;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getParadaID() {
        return paradaID;
    }

    public void setParadaID(Long paradaID) {
        this.paradaID = paradaID;
    }
}
