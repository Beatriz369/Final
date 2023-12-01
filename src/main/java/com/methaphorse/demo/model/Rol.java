package com.methaphorse.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "rol")
@EntityListeners(AuditingEntityListener.class)

public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long rolid;

	@Column(name = "rol")
	private String rol;

	@Column(name = "descripcion")
	private String descripcion;

	public Long getRolid() {
		return rolid;
	}

	public void setRolid(Long rolid) {
		this.rolid = rolid;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Rol(Long rolid, String rol, String descripcion) {
		super();
		this.rolid = rolid;
		this.rol = rol;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "rol [rolid=" + rolid + ", rol=" + rol + ", descripcion=" + descripcion + "]";
	}

	public Rol() {
		
	}
	
	
	
	
	
}
