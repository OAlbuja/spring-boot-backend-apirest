package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.IClienteInteresDao;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.ClienteInteres;

@Service
public class ClienteInteresServiceImpl implements IClienteInteresService {

    @Autowired
    private IClienteInteresDao clienteInteresDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ClienteInteresDTO> findAll() {
        List<ClienteInteres> clienteIntereses = clienteInteresDao.findAll();
        return clienteIntereses.stream()
                               .map(this::convertirADTO)
                               .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteInteresDTO findById(Long id) {
        ClienteInteres clienteInteres = clienteInteresDao.findById(id).orElse(null);
        return clienteInteres != null ? convertirADTO(clienteInteres) : null;
    }

    @Override
    @Transactional
    public ClienteInteresDTO save(ClienteInteresDTO clienteInteresDTO) {
        ClienteInteres clienteInteres = convertirAEntidad(clienteInteresDTO);
        clienteInteres = clienteInteresDao.save(clienteInteres);
        return convertirADTO(clienteInteres);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteInteresDao.deleteById(id);
    }

    private ClienteInteresDTO convertirADTO(ClienteInteres clienteInteres) {
        return modelMapper.map(clienteInteres, ClienteInteresDTO.class);
    }

    private ClienteInteres convertirAEntidad(ClienteInteresDTO clienteInteresDTO) {
        return modelMapper.map(clienteInteresDTO, ClienteInteres.class);
    }
}