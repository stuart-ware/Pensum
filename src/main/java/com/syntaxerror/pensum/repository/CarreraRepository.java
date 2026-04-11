package com.syntaxerror.pensum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntaxerror.pensum.models.Carrera;

public interface CarreraRepository extends JpaRepository<Carrera, Long>{

    List<Carrera> findByEscuela(String escuela);
}
