package com.udla.springboot.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.udla.springboot.backend.apirest.entity.Rol;
import com.udla.springboot.backend.apirest.services.IRolService;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private IRolService rolService;

    // Obtener todos los roles
    @GetMapping("/")
    public List<Rol> listarTodos() {
        return rolService.findAll();
    }

    // Obtener un rol por ID
    @GetMapping("/{id}")
    public Rol obtenerRol(@PathVariable Long id) {
        return rolService.findById(id);
    }

    // Crear un nuevo rol
    @PostMapping("/")
    public Rol crearRol(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    // Actualizar un rol
    @PutMapping("/{id}")
    public Rol actualizarRol(@RequestBody Rol rol, @PathVariable Long id) {
        Rol rolActual = rolService.findById(id);
        if (rolActual != null) {
            rolActual.setNombre(rol.getNombre());
            return rolService.save(rolActual);
        }
        return null; // O manejar la respuesta de manera diferente
    }

    // Eliminar un rol
    @DeleteMapping("/{id}")
    public void eliminarRol(@PathVariable Long id) {
        rolService.delete(id);
    }
}
