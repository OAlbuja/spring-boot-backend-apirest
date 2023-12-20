package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.MatchInteresRepository;
import com.tempoquito.springboot.backend.apirest.models.dto.MatchInteresDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.MatchInteres;

@Service
public class MatchInteresServiceImpl implements IMatchInteresService {

    @Autowired
    private MatchInteresRepository matchInteresDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<MatchInteresDTO> findAll() {
        List<MatchInteres> matchIntereses = matchInteresDao.findAll();
        return matchIntereses.stream()
                             .map(this::convertirADTO)
                             .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public MatchInteresDTO findById(Long id) {
        MatchInteres matchInteres = matchInteresDao.findById(id).orElse(null);
        return matchInteres != null ? convertirADTO(matchInteres) : null;
    }

    @Override
    @Transactional
    public MatchInteresDTO save(MatchInteresDTO matchInteresDTO) {
        MatchInteres matchInteres = convertirAEntidad(matchInteresDTO);
        matchInteres = matchInteresDao.save(matchInteres);
        return convertirADTO(matchInteres);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        matchInteresDao.deleteById(id);
    }

    private MatchInteresDTO convertirADTO(MatchInteres matchInteres) {
        return modelMapper.map(matchInteres, MatchInteresDTO.class);
    }

    private MatchInteres convertirAEntidad(MatchInteresDTO matchInteresDTO) {
        return modelMapper.map(matchInteresDTO, MatchInteres.class);
    }
}
