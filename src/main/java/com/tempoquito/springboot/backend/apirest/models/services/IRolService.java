//Interfase para el CRUD

package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;

import com.tempoquito.springboot.backend.apirest.models.entity.Rol;


public interface IRolService {
    List<Rol> findAll();
    Rol findById(Long id);
    Rol save(Rol rol);
    void delete(Long id);
}