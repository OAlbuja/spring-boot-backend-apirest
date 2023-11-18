package com.tempoquito.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.OneToMany;


@Entity
@Table(name ="clientes")

public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	 @Column(name = "rol")
	    private String rol;
	
	@Column (name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@OneToMany(mappedBy = "cliente1")
    private List<Match> matchesAsCliente1;

    @OneToMany(mappedBy = "cliente2")
    private List<Match> matchesAsCliente2;
	
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();		
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
	
	public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public List<Match> getMatchesAsCliente1() {
        return matchesAsCliente1;
    }

    public void setMatchesAsCliente1(List<Match> matchesAsCliente1) {
        this.matchesAsCliente1 = matchesAsCliente1;
    }

    public List<Match> getMatchesAsCliente2() {
        return matchesAsCliente2;
    }

    public void setMatchesAsCliente2(List<Match> matchesAsCliente2) {
        this.matchesAsCliente2 = matchesAsCliente2;
    }
	
	private static final long serialVersionUID = 1L;
}