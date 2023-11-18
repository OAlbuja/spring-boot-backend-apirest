package com.tempoquito.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.tempoquito.springboot.backend.apirest.models.entity.Match;

public interface IMatchDao extends CrudRepository<Match, Long> {
    
}
