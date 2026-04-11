package com.syntaxerror.pensum.models;

import jakarta.persistence.*;

@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String escuela;

    public Carrera() {}
    public Carrera(String nombre, String escuela) {
        this.nombre = nombre;
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
