package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.dto.ClienteInteresDTO;

public interface IClienteInteresService {
    List<ClienteInteresDTO> findAll();
    ClienteInteresDTO findById(Long id);
    ClienteInteresDTO save(ClienteInteresDTO clienteInteresDTO);
    void delete(Long id);
    List<ClienteInteresDTO> findInteresesByClienteId(Long clienteId);
    List<Long> findAllClienteIdsExcept(Long clienteId); // Nuevo método
}

 
