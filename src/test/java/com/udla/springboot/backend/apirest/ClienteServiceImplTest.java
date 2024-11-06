package com.udla.springboot.backend.apirest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.Optional;

import com.udla.springboot.backend.apirest.dto.ClienteDTO;
import com.udla.springboot.backend.apirest.entity.Cliente;
import com.udla.springboot.backend.apirest.repositories.ClienteRepository;
import com.udla.springboot.backend.apirest.services.ClienteServiceImpl;
import com.udla.springboot.backend.apirest.services.IClienteInteresService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteServiceImplTest {

    @Mock
    private ClienteRepository clienteRepository;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private IClienteInteresService clienteInteresService; // Agregar el mock de clienteInteresService

    @InjectMocks
    private ClienteServiceImpl clienteService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindById() {
        // Datos de prueba
        Long clienteId = 1L;
        Cliente cliente = new Cliente();
        cliente.setId(clienteId);
        cliente.setNombre("Juan");

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(clienteId);
        clienteDTO.setNombre("Juan");

        // Configurar comportamiento de mocks
        when(clienteRepository.findById(clienteId)).thenReturn(Optional.of(cliente));
        when(modelMapper.map(cliente, ClienteDTO.class)).thenReturn(clienteDTO);
        when(clienteInteresService.findInteresesByClienteId(clienteId)).thenReturn(null); // Configurar mock de clienteInteresService

        // Ejecutar el método de prueba
        ClienteDTO result = clienteService.findById(clienteId);

        // Verificar resultados
        assertNotNull(result);
        assertEquals(clienteId, result.getId());
        assertEquals("Juan", result.getNombre());

        // Verificar interacciones
        verify(clienteRepository, times(1)).findById(clienteId);
    }
}
