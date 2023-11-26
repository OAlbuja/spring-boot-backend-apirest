package com.tempoquito.springboot.backend.apirest.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



import com.tempoquito.springboot.backend.apirest.models.services.IClienteService;
import com.tempoquito.springboot.backend.apirest.Utils.ValidationUtils;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidCedulaException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidNameException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidSurnameException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidEmailException;

import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDTO;


//@CrossOrigin(origins = { "http://localhost:4200" }) // Cores configurado.
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/clientes")
	public List<ClienteDTO> index() {
		return clienteService.findAll();
	}

	@GetMapping("/clientes/{id}")
	public ClienteDTO show(@PathVariable Long id) {
		return clienteService.findById(id);
	}

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO create(@RequestBody ClienteDTO clienteDTO) {

		if (!ValidationUtils.isValidCI(clienteDTO.getCedula())) {
			throw new InvalidCedulaException("Número de cédula inválido");
		}
		
		if (!ValidationUtils.isValidName(clienteDTO.getNombre())) {
	        throw new InvalidNameException("Nombre inválido");
	    }

	    if (!ValidationUtils.isValidSurname(clienteDTO.getApellido())) {
	        throw new InvalidSurnameException("Apellido inválido");
	    }
	    
		if (!ValidationUtils.isValidEmail(clienteDTO.getEmail())) {
	        throw new InvalidEmailException("Correo electrónico inválido");
	    }
		
		return clienteService.save(clienteDTO);
	}

	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO update(@RequestBody ClienteDTO clienteDTO, @PathVariable Long id) {

		if (!ValidationUtils.isValidCI(clienteDTO.getCedula())) {
			throw new InvalidCedulaException("Número de cédula inválido");
		}
		
		if (!ValidationUtils.isValidName(clienteDTO.getNombre())) {
	        throw new InvalidNameException("Nombre inválido");
	    }

	    if (!ValidationUtils.isValidSurname(clienteDTO.getApellido())) {
	        throw new InvalidSurnameException("Apellido inválido");
	    }
	    
		if (!ValidationUtils.isValidEmail(clienteDTO.getEmail())) {
	        throw new InvalidEmailException("Correo electrónico inválido");
	    }

		ClienteDTO clienteActual = clienteService.findById(id);
		
		if (clienteActual == null) {
	        // Puedes lanzar una excepción personalizada o retornar una respuesta de error
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no encontrado con ID: " + id);
	    }

		clienteActual.setCedula(clienteDTO.getCedula());
		clienteActual.setApellido(clienteDTO.getApellido());
		clienteActual.setNombre(clienteDTO.getNombre());
		clienteActual.setEmail(clienteDTO.getEmail());
		clienteActual.setRol(clienteDTO.getRol());

		return clienteService.save(clienteActual);
	}

	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
}
