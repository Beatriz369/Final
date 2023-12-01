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
@Table(name = "vendedor")
@EntityListeners(AuditingEntityListener.class)

public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long vendedorid;

	// userid
	@Column(name = "userid")
	private int userid;

	// nombretienda
	@Column(name = "nombretienda")
	private String nombretienda;

	// direcciontienda
	@Column(name = "direcciontienda")
	private String direcciontienda;

	public Long getVendedorid() {
		return vendedorid;
	}

	public void setVendedorid(Long vendedorid) {
		this.vendedorid = vendedorid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getNombretienda() {
		return nombretienda;
	}

	public void setNombretienda(String nombretienda) {
		this.nombretienda = nombretienda;
	}

	public String getDirecciontienda() {
		return direcciontienda;
	}

	public void setDirecciontienda(String direcciontienda) {
		this.direcciontienda = direcciontienda;
	}

	public Vendedor(Long vendedorid, int userid, String nombretienda, String direcciontienda) {
		super();
		this.vendedorid = vendedorid;
		this.userid = userid;
		this.nombretienda = nombretienda;
		this.direcciontienda = direcciontienda;
	}

	@Override
	public String toString() {
		return "Vendedor [vendedorid=" + vendedorid + ", userid=" + userid + ", nombretienda=" + nombretienda
				+ ", direcciontienda=" + direcciontienda + "]";
	}

	public Vendedor() {
		// TODO Auto-generated constructor stub
	}

	

}
