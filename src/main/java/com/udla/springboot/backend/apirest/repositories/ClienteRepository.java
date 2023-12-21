//Necesario para la persistencia de datos con la base de datos
//CrudRepository sirve para heredar todas las operaciones para la persistencia 
//hay documentacion en la pagina de Spring

package com.udla.springboot.backend.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udla.springboot.backend.apirest.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aquí puedes agregar métodos personalizados si lo necesitas
}
