package com.tempoquito.springboot.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tempoquito.springboot.backend.apirest.models.entity.Match;
import com.tempoquito.springboot.backend.apirest.models.services.IMatchService;

@RestController
@RequestMapping("/api")
public class MatchController {

    @Autowired
    private IMatchService matchService;

    // Obtener todos los matches
    @GetMapping("/matches")
    public List<Match> index() {
        return matchService.findAll();
    }

    // Obtener un match por ID
    @GetMapping("/matches/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Match match = matchService.findById(id);
        if (match == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(match, HttpStatus.OK);
    }

    // Crear un nuevo match
    @PostMapping("/matches")
    public ResponseEntity<?> create(@RequestBody Match match) {
        Match matchCreated = matchService.save(match);
        return new ResponseEntity<>(matchCreated, HttpStatus.CREATED);
    }

    // Actualizar un match existente
    @PutMapping("/matches/{id}")
    public ResponseEntity<?> update(@RequestBody Match match, @PathVariable Long id) {
        Match currentMatch = matchService.findById(id);
        if (currentMatch == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // Actualizar los datos del match aquí
        // Por ejemplo: currentMatch.setEstado(match.getEstado());
        Match matchUpdated = matchService.save(currentMatch);
        return new ResponseEntity<>(matchUpdated, HttpStatus.OK);
    }

    // Eliminar un match
    @DeleteMapping("/matches/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Match match = matchService.findById(id);
        if (match == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        matchService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
