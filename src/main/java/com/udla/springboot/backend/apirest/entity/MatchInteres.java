package com.udla.springboot.backend.apirest.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "match_intereses")
public class MatchInteres implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "interes_id")
    private Interes interes;

    @Column(name = "fecha_formacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFormacion;

    @Column(name = "estado_grupo")
    private String estadoGrupo;

    // Getters y setters        

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Interes getInteres() {
		return interes;
	}

	public void setInteres(Interes interes) {
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
	
	private static final long serialVersionUID = 1L;
}
