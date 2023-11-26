package com.tempoquito.springboot.backend.apirest.models.services;

import com.tempoquito.springboot.backend.apirest.models.dto.MatchInteresDTO;
import java.util.List;

public interface IMatchInteresService {
    List<MatchInteresDTO> findAll();
    MatchInteresDTO findById(Long id);
    MatchInteresDTO save(MatchInteresDTO matchInteresDTO);
    void delete(Long id);
}
