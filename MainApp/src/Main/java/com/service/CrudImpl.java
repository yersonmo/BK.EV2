package com.holamundo.ejemplo.holamundo.service;

import org.springframework.stereotype.Service;

import com.holamundo.ejemplo.holamundo.entity.Alumno;

@Service
public class CrudImpl implements Crud {

   

    @Override
    public Object read(int id) {
        // Implementación del método read
        return null;
    }

    @Override
    public void update(int id, Object object) {
        // Implementación del método update
    }

    @Override
    public void delete(int id) {
        // Implementación del método delete
    }

    @Override
    public String create(Alumno alumnos) {
        // Implementación del método create
        System.out.println("Alumno creado: " + alumnos.getNombre());
        return "Alumno creado: " + alumnos.getNombre();
    }

}
