package com.tempoquito.springboot.backend.apirest.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tempoquito.springboot.backend.apirest.models.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{

}
