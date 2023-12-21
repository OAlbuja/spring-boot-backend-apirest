package com.udla.springboot.backend.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.udla.springboot.backend.apirest.entity.ClienteInteres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteInteresRepository extends JpaRepository<ClienteInteres, Long> {
    // Métodos personalizados si son necesarios
	List<ClienteInteres> findByClienteId(Long clienteId);
	
	@Query("SELECT DISTINCT ci.cliente.id FROM ClienteInteres ci WHERE ci.cliente.id <> :clienteId")
	List<Long> findAllClienteIdsExcept(@Param("clienteId") Long clienteId);

}