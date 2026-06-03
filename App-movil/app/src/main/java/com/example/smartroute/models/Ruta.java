package com.example.smartroute.models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Ruta implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;
    private String punto_inicio;
    private String punto_final;
    private Long distancia_total;
    private ArrayList<Parada> paradas_de_ruta;
    private Date fechacreacion;

    public Ruta ( Long id, String nombre, String descripcion, String punto_inicio, String punto_final, Date fechacreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punto_inicio = punto_inicio;
        this.punto_final = punto_final;
        this.fechacreacion = fechacreacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public  String getPunto_inicio() {
        return punto_inicio;
    }

    public  String getPunto_final() {
        return punto_final;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public  void setNombre(String nombre) {
        nombre = nombre;
    }

    public  void setDescripcion(String descripcion) {
        descripcion = descripcion;
    }

    public  void setPunto_inicio(String punto_inicio) {
        punto_inicio = punto_inicio;
    }

    public  void setPunto_final(String punto_final) {
        punto_final = punto_final;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
}
