package com.mainapp.mainapp.repository;

import com.mainapp.mainapp.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}