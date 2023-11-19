package com.tempoquito.springboot.backend.apirest.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tempoquito.springboot.backend.apirest.models.entity.Match;

public interface IMatchDao extends JpaRepository<Match, Long> {
    
}
