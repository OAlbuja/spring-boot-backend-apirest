package com.udla.springboot.backend.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.udla.springboot.backend.apirest.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{

}
