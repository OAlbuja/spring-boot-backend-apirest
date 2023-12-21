package com.udla.springboot.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udla.springboot.backend.apirest.dto.MatchDTO;
import com.udla.springboot.backend.apirest.services.IMatchService;

@RestController
@RequestMapping("/api")
public class MatchController {

    @Autowired
    private IMatchService matchService;

    // Obtener todos los matches
    @GetMapping("/matches")
    public List<MatchDTO> index() {
        return matchService.findAll();
    }

    // Obtener un match por ID
    @GetMapping("/matches/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        MatchDTO matchDTO = matchService.findById(id);
        if (matchDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(matchDTO, HttpStatus.OK);
    }

    // Crear un nuevo match
    @PostMapping("/matches")
    public ResponseEntity<?> create(@RequestBody MatchDTO matchDTO) {
        MatchDTO matchCreatedDTO = matchService.save(matchDTO);
        return new ResponseEntity<>(matchCreatedDTO, HttpStatus.CREATED);
    }

    // Actualizar un match existente
    @PutMapping("/matches/{id}")
    public ResponseEntity<?> update(@RequestBody MatchDTO matchDTO, @PathVariable Long id) {
        MatchDTO currentMatchDTO = matchService.findById(id);
        if (currentMatchDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // Actualizar los datos del match
        currentMatchDTO.setClienteID1(matchDTO.getClienteID1());
        currentMatchDTO.setClienteNombre1(matchDTO.getClienteNombre1());
        currentMatchDTO.setClienteId2(matchDTO.getClienteId2());
        currentMatchDTO.setClienteNombre2(matchDTO.getClienteNombre2());
        currentMatchDTO.setFechaMatch(matchDTO.getFechaMatch());
        currentMatchDTO.setEstado(matchDTO.getEstado());
        
        // Por ejemplo: currentMatch.setEstado(match.getEstado());
        MatchDTO matchUpdatedDTO = matchService.save(currentMatchDTO);
        return new ResponseEntity<>(matchUpdatedDTO, HttpStatus.OK);
    }

    // Eliminar un match
    @DeleteMapping("/matches/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        MatchDTO matchDTO = matchService.findById(id);
        if (matchDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        matchService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
