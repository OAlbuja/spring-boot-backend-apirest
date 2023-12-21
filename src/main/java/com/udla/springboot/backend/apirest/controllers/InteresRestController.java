package com.udla.springboot.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.udla.springboot.backend.apirest.dto.InteresDTO;
import com.udla.springboot.backend.apirest.services.IInteresService;

@RestController
@RequestMapping("/api")
public class InteresRestController {

    @Autowired
    private IInteresService interesService;

    // Obtener todos los intereses
    @GetMapping("/intereses")
    public List<InteresDTO> listarTodos() {
        return interesService.findAll();
    }

    // Obtener un interes por ID
    @GetMapping("/intereses/{id}")
    public InteresDTO obtenerInteres(@PathVariable Long id) {
        return interesService.findById(id);
    }

    // Crear un nuevo interes
    @PostMapping("/intereses")
    @ResponseStatus(HttpStatus.CREATED)
    public InteresDTO crearInteres(@RequestBody InteresDTO interesDTO) {
        return interesService.save(interesDTO);
    }

    // Actualizar un interes existente
    @PutMapping("/intereses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public InteresDTO actualizarInteres(@RequestBody InteresDTO interesDTO, @PathVariable Long id) {
        InteresDTO interesActual = interesService.findById(id);
        if (interesActual != null) {
            interesActual.setNombre(interesDTO.getNombre());
            return interesService.save(interesActual);
        }
        // Aquí puedes manejar el caso de que el interes no exista (por ejemplo, lanzando una excepción)
        return null;
    }

    // Eliminar un interes
    @DeleteMapping("/intereses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarInteres(@PathVariable Long id) {
        interesService.delete(id);
    }
}
