//Interfase para el CRUD

package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.dto.ClienteDTO;


public interface IClienteService {
    List<ClienteDTO> findAll();
    ClienteDTO findById(Long id);
    ClienteDTO save(ClienteDTO clienteDTO);
    void delete(Long id);
}

