package com.tempoquito.springboot.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.tempoquito.springboot.backend.apirest.models.services.IClienteInteresService;
import com.tempoquito.springboot.backend.apirest.models.services.KNNService;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDistanciaDTO;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;


//@CrossOrigin(origins = { "http://localhost:4200" }) // Configuración de CORS
@RestController
@RequestMapping("/api")
public class ClienteInteresRestController {

    @Autowired
    private IClienteInteresService clienteInteresService;
    
    @Autowired
    private KNNService knnService;

    @GetMapping("/cliente-intereses/{clienteId}/recomendaciones")
    public List<ClienteDistanciaDTO> obtenerRecomendaciones(@PathVariable Long clienteId, @RequestParam int k) {
        return knnService.encontrarVecinosCercanos(clienteId, k);
    }
    
    @GetMapping("/cliente-intereses")
    public List<ClienteInteresDTO> index() {
        return clienteInteresService.findAll();
    }

    @GetMapping("/cliente-intereses/{id}")
    public ClienteInteresDTO show(@PathVariable Long id) {
        return clienteInteresService.findById(id);
    }

    @PostMapping("/cliente-intereses")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteInteresDTO create(@RequestBody ClienteInteresDTO clienteInteresDTO) {
        return clienteInteresService.save(clienteInteresDTO);
    }

    @PutMapping("/cliente-intereses/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteInteresDTO update(@RequestBody ClienteInteresDTO clienteInteresDTO, @PathVariable Long id) {
        ClienteInteresDTO clienteInteresActual = clienteInteresService.findById(id);
        if (clienteInteresActual != null) {
            clienteInteresActual.setClienteId(clienteInteresDTO.getClienteId());
            clienteInteresActual.setInteresId(clienteInteresDTO.getInteresId());
            clienteInteresActual.setPonderacion(clienteInteresDTO.getPonderacion());
            return clienteInteresService.save(clienteInteresActual);
        }
        // Aquí puedes manejar el caso en que el ClienteInteres no se encuentre        
        return null; // O lanzar una excepción
    }

    @DeleteMapping("/cliente-intereses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        clienteInteresService.delete(id);
    }
}
