package com.mainapp.mainapp.service;

import com.mainapp.mainapp.entity.Alumno;
import com.mainapp.mainapp.entity.Profesor;
import com.mainapp.mainapp.entity.Curso;

import java.util.List;

public interface Crud {

    // === ALUMNO ===
    String create(Alumno alumno);
    Alumno readAlumno(int id);
    List<Alumno> readAllAlumnos();
    String updateAlumno(int id, Alumno alumno);
    String deleteAlumno(int id);

    // === PROFESOR ===
    String create(Profesor profesor);
    Profesor readProfesor(int id);
    List<Profesor> readAllProfesores();
    String updateProfesor(int id, Profesor profesor);
    String deleteProfesor(int id);

    // === CURSO ===
    String create(Curso curso);
    Curso readCurso(int id);
    List<Curso> readAllCursos();
    String updateCurso(int id, Curso curso);
    String deleteCurso(int id);
}