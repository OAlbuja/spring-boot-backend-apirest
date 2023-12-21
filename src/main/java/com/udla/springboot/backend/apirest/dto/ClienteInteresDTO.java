package com.udla.springboot.backend.apirest.dto;

public class ClienteInteresDTO {
    private Long id;
    private Long clienteId;
    private Long interesId;
    private Integer ponderacion;
    
    // Getters y setters
    // ...
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public Long getInteresId() {
		return interesId;
	}
	public void setInteresId(Long interesId) {
		this.interesId = interesId;
	}
	public Integer getPonderacion() {
		return ponderacion;
	}
	public void setPonderacion(Integer ponderacion) {
		this.ponderacion = ponderacion;
	}
	
	// Sobrescribe el método toString()
    @Override
    public String toString() {
        return "ClienteInteresDTO{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", interesId=" + interesId +
                ", ponderacion=" + ponderacion +
                '}';
    }
	

   
}
