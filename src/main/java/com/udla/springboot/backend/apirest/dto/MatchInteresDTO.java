package com.udla.springboot.backend.apirest.dto;

import java.util.Date;


public class MatchInteresDTO {
	
    private Long id;    
    private Long match;    
    private Long interes;    
    private Date fechaFormacion;
    private String estadoGrupo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMatch() {
		return match;
	}
	public void setMatch(Long match) {
		this.match = match;
	}
	public Long getInteres() {
		return interes;
	}
	public void setInteres(Long interes) {
		this.interes = interes;
	}
	public Date getFechaFormacion() {
		return fechaFormacion;
	}
	public void setFechaFormacion(Date fechaFormacion) {
		this.fechaFormacion = fechaFormacion;
	}
	public String getEstadoGrupo() {
		return estadoGrupo;
	}
	public void setEstadoGrupo(String estadoGrupo) {
		this.estadoGrupo = estadoGrupo;
	}     
}
