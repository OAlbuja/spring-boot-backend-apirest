package com.tempoquito.springboot.backend.apirest.models.dao;

import com.tempoquito.springboot.backend.apirest.models.entity.Interes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInteresDao extends JpaRepository<Interes, Long> {
    // Métodos personalizados si son necesarios
}