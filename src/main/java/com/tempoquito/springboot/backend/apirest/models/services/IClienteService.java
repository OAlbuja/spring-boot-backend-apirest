//Interfase para el CRUD

package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDTO;


public interface IClienteService {
    List<ClienteDTO> findAll();
    ClienteDTO findById(Long id);
    ClienteDTO save(ClienteDTO clienteDTO);
    void delete(Long id);
}

