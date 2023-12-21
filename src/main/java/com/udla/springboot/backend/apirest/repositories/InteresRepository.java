package com.udla.springboot.backend.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udla.springboot.backend.apirest.entity.Interes;

public interface InteresRepository extends JpaRepository<Interes, Long> {
    // Métodos personalizados si son necesarios
}