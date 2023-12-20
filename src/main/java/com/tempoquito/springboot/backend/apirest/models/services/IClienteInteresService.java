package com.tempoquito.springboot.backend.apirest.models.services;

import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;

import java.util.List;

public interface IClienteInteresService {
    List<ClienteInteresDTO> findAll();
    ClienteInteresDTO findById(Long id);
    ClienteInteresDTO save(ClienteInteresDTO clienteInteresDTO);
    void delete(Long id);
    List<ClienteInteresDTO> findInteresesByClienteId(Long clienteId);
    List<Long> findAllClienteIdsExcept(Long clienteId); // Nuevo método
}

 
