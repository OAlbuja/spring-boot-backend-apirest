package com.tempoquito.springboot.backend.apirest.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tempoquito.springboot.backend.apirest.models.entity.Cliente;
import com.tempoquito.springboot.backend.apirest.models.services.IClienteService;
import com.tempoquito.springboot.backend.apirest.Utils.ValidationUtils;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidCedulaException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidNameException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidSurnameException;
import com.tempoquito.springboot.backend.apirest.exceptions.InvalidEmailException;

@CrossOrigin(origins = { "http://localhost:4200" }) // Cores configurado.
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}

	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {

		if (!ValidationUtils.isValidCI(cliente.getCedula())) {
			throw new InvalidCedulaException("Número de cédula inválido");
		}
		
		if (!ValidationUtils.isValidName(cliente.getNombre())) {
	        throw new InvalidNameException("Nombre inválido");
	    }

	    if (!ValidationUtils.isValidSurname(cliente.getApellido())) {
	        throw new InvalidSurnameException("Apellido inválido");
	    }
	    
		if (!ValidationUtils.isValidEmail(cliente.getEmail())) {
	        throw new InvalidEmailException("Correo electrónico inválido");
	    }
		
		return clienteService.save(cliente);
	}

	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {

		if (!ValidationUtils.isValidCI(cliente.getCedula())) {
			throw new InvalidCedulaException("Número de cédula inválido");
		}
		
		if (!ValidationUtils.isValidName(cliente.getNombre())) {
	        throw new InvalidNameException("Nombre inválido");
	    }

	    if (!ValidationUtils.isValidSurname(cliente.getApellido())) {
	        throw new InvalidSurnameException("Apellido inválido");
	    }
	    
		if (!ValidationUtils.isValidEmail(cliente.getEmail())) {
	        throw new InvalidEmailException("Correo electrónico inválido");
	    }

		Cliente clienteActual = clienteService.findById(id);

		clienteActual.setCedula(cliente.getCedula());
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setEmail(cliente.getEmail());
		clienteActual.setRol(cliente.getRol());

		return clienteService.save(clienteActual);
	}

	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
}
