package com.udla.springboot.backend.apirest.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.udla.springboot.backend.apirest.entity.MatchInteres;

public interface MatchInteresRepository extends JpaRepository<MatchInteres, Long> {
    // Métodos personalizados si son necesarios
}