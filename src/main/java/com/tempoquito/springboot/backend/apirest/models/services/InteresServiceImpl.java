package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.IInteresDao;
import com.tempoquito.springboot.backend.apirest.models.dto.InteresDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.Interes;

@Service
public class InteresServiceImpl implements IInteresService {

	@Autowired
    private IInteresDao interesDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<InteresDTO> findAll() {
        List<Interes> interes = interesDao.findAll();
        return interes.stream()
                       .map(this::convertirADTO)
                       .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public InteresDTO findById(Long id) {
        Interes interes = interesDao.findById(id).orElse(null);
        return interes != null ? convertirADTO(interes) : null;
    }

    @Override
    @Transactional
    public InteresDTO save(InteresDTO interesDTO) {
    	Interes interes = convertirAEntidad(interesDTO);
        interes = interesDao.save(interes);
        return convertirADTO(interes);
    }

    @Override
    @Transactional
    public void delete(Long id) {
    	interesDao.deleteById(id);
    }

    private InteresDTO convertirADTO(Interes interes) {
        return modelMapper.map(interes, InteresDTO.class);
    }

    private Interes convertirAEntidad(InteresDTO interesDTO) {
        return modelMapper.map(interesDTO, Interes.class);
    }
}
