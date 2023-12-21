package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.dto.InteresDTO;

public interface IInteresService {
	
	long countTotalIntereses();
	List<InteresDTO> findAll();
    InteresDTO findById(Long id);
    InteresDTO save(InteresDTO interesDTO);
    void delete(Long id);
    
}

// Implementación similar para ClienteInteresService
