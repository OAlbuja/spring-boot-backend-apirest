package com.udla.springboot.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.udla.springboot.backend.apirest.dto.MatchInteresDTO;
import com.udla.springboot.backend.apirest.services.IMatchInteresService;

@RestController
@RequestMapping("/api")
public class MatchInteresRestController {

    @Autowired
    private IMatchInteresService matchInteresService;

    @GetMapping("/match-intereses")
    public List<MatchInteresDTO> index() {
        return matchInteresService.findAll();
    }

    @GetMapping("/match-intereses/{id}")
    public MatchInteresDTO show(@PathVariable Long id) {
        return matchInteresService.findById(id);
    }

    @PostMapping("/match-intereses")
    @ResponseStatus(HttpStatus.CREATED)
    public MatchInteresDTO create(@RequestBody MatchInteresDTO matchInteresDTO) {
        return matchInteresService.save(matchInteresDTO);
    }

    @PutMapping("/match-intereses/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MatchInteresDTO update(@RequestBody MatchInteresDTO matchInteresDTO, @PathVariable Long id) {
        MatchInteresDTO matchInteresActual = matchInteresService.findById(id);
        if (matchInteresActual != null) {
            // Aquí puedes actualizar los campos necesarios
            return matchInteresService.save(matchInteresActual);
        }
        // Manejar el caso en que el MatchInteres no se encuentre
        return null; // O lanzar una excepción
    }

    @DeleteMapping("/match-intereses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        matchInteresService.delete(id);
    }
}
