// Interfaz para el CRUD de Match

package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import com.tempoquito.springboot.backend.apirest.models.entity.Match;

public interface IMatchService {
    List<Match> findAll();
    Match findById(Long id);
    Match save(Match match);
    void delete(Long id);
}
