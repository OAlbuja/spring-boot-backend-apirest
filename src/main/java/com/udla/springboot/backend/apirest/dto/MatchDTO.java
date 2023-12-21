package com.udla.springboot.backend.apirest.dto;

import java.util.Date;


public class MatchDTO {

    private Long id;
    private Long clienteID1;
    private String clienteNombre1; // Nombre del primer cliente
    private Long clienteId2;
    private String clienteNombre2; // Nombre del segundo cliente
    private Date fechaMatch;
    private String estado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClienteID1() {
		return clienteID1;
	}
	public void setClienteID1(Long clienteID1) {
		this.clienteID1 = clienteID1;
	}
	public String getClienteNombre1() {
		return clienteNombre1;
	}
	public void setClienteNombre1(String clienteNombre1) {
		this.clienteNombre1 = clienteNombre1;
	}
	public Long getClienteId2() {
		return clienteId2;
	}
	public void setClienteId2(Long clienteId2) {
		this.clienteId2 = clienteId2;
	}
	public String getClienteNombre2() {
		return clienteNombre2;
	}
	public void setClienteNombre2(String clienteNombre2) {
		this.clienteNombre2 = clienteNombre2;
	}
	public Date getFechaMatch() {
		return fechaMatch;
	}
	public void setFechaMatch(Date fechaMatch) {
		this.fechaMatch = fechaMatch;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
    
}
