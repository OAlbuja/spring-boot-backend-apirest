// Interfaz para el CRUD de Match

package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.dto.MatchDTO;


public interface IMatchService {
    List<MatchDTO> findAll();
    MatchDTO findById(Long id);
    MatchDTO save(MatchDTO matchDTO);
    void delete(Long id);
}
