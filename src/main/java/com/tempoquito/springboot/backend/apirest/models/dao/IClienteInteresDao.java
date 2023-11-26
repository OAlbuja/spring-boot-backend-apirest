package com.tempoquito.springboot.backend.apirest.models.dao;

import com.tempoquito.springboot.backend.apirest.models.entity.ClienteInteres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteInteresDao extends JpaRepository<ClienteInteres, Long> {
    // Métodos personalizados si son necesarios
}