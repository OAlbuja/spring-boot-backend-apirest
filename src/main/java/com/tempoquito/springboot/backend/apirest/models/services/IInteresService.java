package com.tempoquito.springboot.backend.apirest.models.services;

import com.tempoquito.springboot.backend.apirest.models.dto.InteresDTO;
import java.util.List;

public interface IInteresService {
    List<InteresDTO> findAll();
    InteresDTO findById(Long id);
    InteresDTO save(InteresDTO interesDTO);
    void delete(Long id);
}

// Implementación similar para ClienteInteresService
