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
@Table(name = "elementoscarrito")
@EntityListeners(AuditingEntityListener.class)



public class ElementosCarrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long elementoid;
	
	@Column(name = "carritoid")
	private int carritoid;
	
	
	@Column(name = "productoid")
	private int productoid;

	@Column(name = "cantidad")
	private int cantidad;

	public Long getElementoid() {
		return elementoid;
	}

	public void setElementoid(Long elementoid) {
		this.elementoid = elementoid;
	}

	public int getCarritoid() {
		return carritoid;
	}

	public void setCarritoid(int carritoid) {
		this.carritoid = carritoid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ElementosCarrito(Long elementoid, int carritoid, int productoid, int cantidad) {
		super();
		this.elementoid = elementoid;
		this.carritoid = carritoid;
		this.productoid = productoid;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ElementosCarrito [elementoid=" + elementoid + ", carritoid=" + carritoid + ", productoid=" + productoid
				+ ", cantidad=" + cantidad + "]";
	}

	public ElementosCarrito() {
		// TODO Auto-generated constructor stub
	}
	

}
