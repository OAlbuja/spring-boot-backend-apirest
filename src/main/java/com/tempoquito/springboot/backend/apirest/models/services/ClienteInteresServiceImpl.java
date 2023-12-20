package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.ClienteInteresRepository;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;
import com.tempoquito.springboot.backend.apirest.models.entity.ClienteInteres;

@Service
public class ClienteInteresServiceImpl implements IClienteInteresService {

    @Autowired
    private ClienteInteresRepository clienteInteresRepository;

    @Autowired
    private ModelMapper modelMapper;

    
    @Override
    @Transactional(readOnly = true)
    public List<ClienteInteresDTO> findAll() {
        List<ClienteInteres> clienteIntereses = clienteInteresRepository.findAll();
        return clienteIntereses.stream()
                               .map(this::convertirADTO)
                               .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteInteresDTO findById(Long id) {
        ClienteInteres clienteInteres = clienteInteresRepository.findById(id).orElse(null);
        return clienteInteres != null ? convertirADTO(clienteInteres) : null;
    }

    @Override
    @Transactional
    public ClienteInteresDTO save(ClienteInteresDTO clienteInteresDTO) {
        ClienteInteres clienteInteres = convertirAEntidad(clienteInteresDTO);
        clienteInteres = clienteInteresRepository.save(clienteInteres);
        return convertirADTO(clienteInteres);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteInteresRepository.deleteById(id);
    }
    
 // Método para obtener los intereses y ponderaciones de un cliente específico
    public List<ClienteInteresDTO> findInteresesByClienteId(Long clienteId) {
        List<ClienteInteres> clienteIntereses = clienteInteresRepository.findByClienteId(clienteId);
        return clienteIntereses.stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Long> findAllClienteIdsExcept(Long clienteId) {
        return clienteInteresRepository.findAllClienteIdsExcept(clienteId);
    }
    
    public double[] convertirInteresesADoubleArray(List<ClienteInteresDTO> clienteInteresesDTO) {
        double[] interesesArray = new double[clienteInteresesDTO.size()];
        for (int i = 0; i < clienteInteresesDTO.size(); i++) {
            ClienteInteresDTO ci = clienteInteresesDTO.get(i);
            interesesArray[i] = ci.getPonderacion(); // Asumiendo que tienes un atributo 'ponderacion' en ClienteInteresDTO
        }
        return interesesArray;
    }

    
    private ClienteInteresDTO convertirADTO(ClienteInteres clienteInteres) {
        return modelMapper.map(clienteInteres, ClienteInteresDTO.class);
    }

    private ClienteInteres convertirAEntidad(ClienteInteresDTO clienteInteresDTO) {
        return modelMapper.map(clienteInteresDTO, ClienteInteres.class);
    }
}
