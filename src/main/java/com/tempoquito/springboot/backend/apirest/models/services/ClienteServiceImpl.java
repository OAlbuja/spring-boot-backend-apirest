package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.ClienteRepository;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDTO;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private IClienteInteresService clienteInteresService; // Servicio para manejar intereses

    @Autowired
    private ModelMapper modelMapper;
    
    

    @Override
    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream()
                       .map(this::convertirADTO)
                       .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            ClienteDTO clienteDTO = convertirADTO(cliente);
            List<ClienteInteresDTO> interesesDTO = clienteInteresService.findInteresesByClienteId(id);
            clienteDTO.setClienteInteresesDTO(interesesDTO);
         // Log para depuración
            System.out.println("Cliente DTO: " + clienteDTO);
            System.out.println("Intereses DTO: " + interesesDTO);
            
            return clienteDTO;
        }
        return null;
    }

    @Override
    @Transactional
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = convertirAEntidad(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return convertirADTO(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    private ClienteDTO convertirADTO(Cliente cliente) {
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    private Cliente convertirAEntidad(ClienteDTO clienteDTO) {
        return modelMapper.map(clienteDTO, Cliente.class);
    }
}
