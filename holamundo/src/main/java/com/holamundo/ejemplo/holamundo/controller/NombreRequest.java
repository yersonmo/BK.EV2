package com.holamundo.ejemplo.holamundo.controller;

public class NombreRequest {
    private String nombre;

    // Constructor vacío (obligatorio para Spring)
    public NombreRequest() {}

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}