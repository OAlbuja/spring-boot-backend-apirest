package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.IClienteDao;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = clienteDao.findAll();
        return clientes.stream()
                       .map(this::convertirADTO)
                       .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        Cliente cliente = clienteDao.findById(id).orElse(null);
        return cliente != null ? convertirADTO(cliente) : null;
    }

    @Override
    @Transactional
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = convertirAEntidad(clienteDTO);
        cliente = clienteDao.save(cliente);
        return convertirADTO(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

    private ClienteDTO convertirADTO(Cliente cliente) {
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    private Cliente convertirAEntidad(ClienteDTO clienteDTO) {
        return modelMapper.map(clienteDTO, Cliente.class);
    }
}
