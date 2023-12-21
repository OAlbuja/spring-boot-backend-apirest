package com.udla.springboot.backend.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String nombre;

    // Constructor vacío
    public Rol() {
    }

    // Constructor con parámetros
    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private static final long serialVersionUID = 1L;
}


//En este código:
//
//La entidad Rol tiene un id como clave primaria y un campo nombre para el nombre del rol.
//He usado anotaciones de JPA (@Entity, @Table, @Id, etc.) para mapear esta clase a una tabla 
//en la base de datos.
//El campo nombre tiene la restricción unique para asegurar que no haya roles duplicados.
//Esta entidad se relacionará con la entidad Cliente a través de una relación muchos a muchos. 
//Esto permite que un cliente tenga varios roles y que un rol pueda estar asignado a varios clientes.