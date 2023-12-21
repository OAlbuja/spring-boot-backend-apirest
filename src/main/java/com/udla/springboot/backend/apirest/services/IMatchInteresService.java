package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.dto.MatchInteresDTO;

public interface IMatchInteresService {
    List<MatchInteresDTO> findAll();
    MatchInteresDTO findById(Long id);
    MatchInteresDTO save(MatchInteresDTO matchInteresDTO);
    void delete(Long id);
}
