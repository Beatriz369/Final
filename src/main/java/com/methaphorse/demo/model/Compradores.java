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
@Table(name = "compradores")
@EntityListeners(AuditingEntityListener.class)

public class Compradores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// id
	private Long compradorid;

	// nombre
	@Column(name = "nombre")
	private String nombre;

	// direccion
	@Column(name = "direccion")
	private String direccion;

	// comentarioid
	@Column(name = "comentarioid")
	private int comentarioid;

	// productoid
	@Column(name = "productoid")
	private int productoid;

	// userid
	@Column(name = "userid")
	private int userid;

	public Long getId() {
		return compradorid;
	}

	public void setId(Long id) {
		this.compradorid = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getComentarioid() {
		return comentarioid;
	}

	public void setComentarioid(int comentarioid) {
		this.comentarioid = comentarioid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Compradores(Long id, String nombre, String direccion, int comentarioid, int productoid, int userid) {
		super();
		this.compradorid = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.comentarioid = comentarioid;
		this.productoid = productoid;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Compradores [id=" + compradorid + ", nombre=" + nombre + ", direccion=" + direccion + ", comentarioid="
				+ comentarioid + ", productoid=" + productoid + ", userid=" + userid + "]";
	}

	public Compradores() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
