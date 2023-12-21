// Implementación del servicio para Match

package com.udla.springboot.backend.apirest.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udla.springboot.backend.apirest.dto.MatchDTO;
import com.udla.springboot.backend.apirest.entity.Match;
import com.udla.springboot.backend.apirest.repositories.MatchRepository;

@Service
public class MatchServiceImpl implements IMatchService {

    @Autowired
    private MatchRepository matchDao;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<MatchDTO> findAll() {
        List<Match> match = matchDao.findAll();
        return match.stream()
                .map(this::convertirAEntidad)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public MatchDTO findById(Long id) {
        Match match = matchDao.findById(id).orElse(null);
        return match != null ? convertirAEntidad(match) : null;
    }

    @Override
    @Transactional
    public MatchDTO save(MatchDTO matchDTO) {
    	Match match = convertirADTO(matchDTO);
        match =  matchDao.save(match);
        return convertirAEntidad(match);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        matchDao.deleteById(id);
    }
    
    private MatchDTO convertirAEntidad(Match match) {
        return modelMapper.map(match, MatchDTO.class);
    }

    private Match convertirADTO(MatchDTO matchDTO) {
        return modelMapper.map(matchDTO, Match.class);
    }
}
