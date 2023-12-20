package com.tempoquito.springboot.backend.apirest.models.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ClienteDTO {
    
	private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private Set<String> roles;
    private Date createAt;
    private Integer semestreCursado;
    private List<ClienteInteresDTO> clienteInteresesDTO;
    
    
    public ClienteDTO() {
        this.clienteInteresesDTO = new ArrayList<>();
    }

    // Getters y setters para clienteInteresesDTO
    public List<ClienteInteresDTO> getClienteInteresesDTO() {
        return clienteInteresesDTO;
    }

    public void setClienteInteresesDTO(List<ClienteInteresDTO> clienteInteresesDTO) {
        this.clienteInteresesDTO = clienteInteresesDTO;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getSemestreCursado() {
		return semestreCursado;
	}
	public void setSemestreCursado(Integer semestreCursado) {
		this.semestreCursado = semestreCursado;
	}

	@Override
	public String toString() {
		return "ClienteDTO{" +
				"id=" + id + 
				", cedula=" + cedula + 
				", nombre=" + nombre + 
				", apellido=" + apellido + 
				", email=" + email + 
				", roles=" + roles + 
				", createAt=" + createAt + 
				", semestreCursado=" + semestreCursado + 
				", clienteInteresesDTO=" + clienteInteresesDTO;
	}
	
    
	
}
