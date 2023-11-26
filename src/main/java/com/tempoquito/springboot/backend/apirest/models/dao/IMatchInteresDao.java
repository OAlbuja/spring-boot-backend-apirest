package com.tempoquito.springboot.backend.apirest.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tempoquito.springboot.backend.apirest.models.entity.MatchInteres;

public interface IMatchInteresDao extends JpaRepository<MatchInteres, Long> {
    // Métodos personalizados si son necesarios
}