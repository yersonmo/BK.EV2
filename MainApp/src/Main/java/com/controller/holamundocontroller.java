package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.holamundo.ejemplo.holamundo.entity.Alumno;
import com.holamundo.ejemplo.holamundo.service.Crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class holamundocontroller {
    @Autowired
    private Crud crud;
    @GetMapping("/holamundo")
    public String holamundo() {
        return "Hola Mundo desde Spring Boot!";
    }

    @GetMapping("/presentacion")
    public String presentacion() {
        return "Hola a todos, mi nombre es Pedro";
    }

    @GetMapping("/hello/{nombre}")
    public String saludarPorNombre(@PathVariable String nombre) {
        return "Hola a todos, mi nombre es " + nombre;
    }

    @PostMapping("/hello")
    public String saludarPorPost(@RequestBody NombreRequest request) {
        return "Hola a todos, mi nombre es " + request.getNombre();
    }
    public static class NombreRequest {
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    @PostMapping("/alumno")
    public String crearAlumno(@RequestBody Alumno alumno) {
        // Aquí puedes agregar la lógica para guardar el alumno en la base de datos
        return crud.create(alumno);
    }
        
}
