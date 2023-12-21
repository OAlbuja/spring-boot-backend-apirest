package com.udla.springboot.backend.apirest.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.udla.springboot.backend.apirest.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
    
}
