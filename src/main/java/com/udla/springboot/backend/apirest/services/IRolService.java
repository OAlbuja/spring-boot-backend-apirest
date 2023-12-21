//Interfase para el CRUD

package com.udla.springboot.backend.apirest.services;

import java.util.List;

import com.udla.springboot.backend.apirest.entity.Rol;


public interface IRolService {
    List<Rol> findAll();
    Rol findById(Long id);
    Rol save(Rol rol);
    void delete(Long id);
}