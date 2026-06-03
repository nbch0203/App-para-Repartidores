package com.example.smartroute.models;
import java.io.Serializable;
public class Usuario implements Serializable {

    private static Long id;
    private static String nombre;
    private static String apellido_1;
    private static String apellido_2;
    private static String email;
    private static String telefono;

    public static Long getId() {
        return id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }

    public static String getApellido_1() {
        return apellido_1;
    }

    public static void setApellido_1(String apellido_1) {
        Usuario.apellido_1 = apellido_1;
    }

    public static String getApellido_2() {
        return apellido_2;
    }

    public static void setApellido_2(String apellido_2) {
        Usuario.apellido_2 = apellido_2;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Usuario.telefono = telefono;
    }
}
