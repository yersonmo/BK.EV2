package com.holamundo.ejemplo.holamundo.service;

import org.springframework.stereotype.Repository;

import com.holamundo.ejemplo.holamundo.entity.Alumno;

@Repository
public interface Crud {
    String create(Alumno alumnos);

    Object read(int id);

    void update(int id, Object object);

    void delete(int id);
}
