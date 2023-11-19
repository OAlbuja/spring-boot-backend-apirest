// Interfaz para el CRUD de Match

package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;

import com.tempoquito.springboot.backend.apirest.models.dto.MatchDTO;


public interface IMatchService {
    List<MatchDTO> findAll();
    MatchDTO findById(Long id);
    MatchDTO save(MatchDTO matchDTO);
    void delete(Long id);
}
