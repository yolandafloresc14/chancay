package com.example.chancay.model;

import jakarta.persistence.*;

@Entity
@Table(name = "embarcacion")

public class Embarcacion {
    
    //Creacion de la clave primaria id_autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    //Columna nombre
    @Column(length = 50, nullable = false)
    private String nombre;

    //Columna capacidad de toneladas de la carga
    @Column(nullable = false)
    private double capacidad;

    //Descripcion de la embarcacion
    @Column(length = 250, nullable = true)
    private String descripcion;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
