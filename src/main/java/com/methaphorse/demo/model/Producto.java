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
@Table(name = "producto")
@EntityListeners(AuditingEntityListener.class)

public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//productoid
	private Long productoid;

	// nombre
	@Column(name = "nombre")
	private String nombre;

	// descripcion
	@Column(name = "descripcion")
	private String descripcion;

	// precio
	@Column(name = "precio")
	private float precio;

	// vendedorid
	@Column(name = "vendedorid")
	private int vendedorid;

	// categoriaid
	@Column(name = "categoriaid")
	private int categoriaid;

	public Long getProductoid() {
		return productoid;
	}

	public void setProductoid(Long productoid) {
		this.productoid = productoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float rol) {
		this.precio = rol;
	}

	public int getVendedorid() {
		return vendedorid;
	}

	public void setVendedorid(int vendedorid) {
		this.vendedorid = vendedorid;
	}

	public int getCategoriaid() {
		return categoriaid;
	}

	public void setCategoriaid(int categoriaid) {
		this.categoriaid = categoriaid;
	}

	public Producto(Long productoid, String nombre, String descripcion, float rol, int vendedorid, int categoriaid) {
		super();
		this.productoid = productoid;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = rol;
		this.vendedorid = vendedorid;
		this.categoriaid = categoriaid;
	}

	@Override
	public String toString() {
		return "Producto [productoid=" + productoid + ", nombre=" + nombre + ", descripcion=" + descripcion + ", rol="
				+ precio + ", vendedorid=" + vendedorid + ", categoriaid=" + categoriaid + "]";
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
