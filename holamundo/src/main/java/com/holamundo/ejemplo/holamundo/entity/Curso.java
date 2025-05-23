package com.holamundo.ejemplo.holamundo.entity;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int duracion;

    // Constructor vacío (obligatorio para Spring)
    public Curso() {}

    // Constructor con parámetros
    public Curso(int id, String nombre, String descripcion, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
