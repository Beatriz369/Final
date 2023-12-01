package com.methaphorse.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
//import javax.persistence.GenerationType;
//import javax.persistence.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "carritocompras")
@EntityListeners(AuditingEntityListener.class)




public class CarritoCompras  {
	//private static final 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carritoid;
	
	@Column(name = "userid")
	private int userid;
	

	@Column(name = "fechacreacion")
	private Date fechacreacion;


	public Long getCarritoid() {
		return carritoid;
	}


	public void setCarritoid(Long carritoid) {
		this.carritoid = carritoid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public Date getFechacreacion() {
		return fechacreacion;
	}


	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}


	public CarritoCompras(Long carritoid, int userid, Date fechacreacion) {
		super();
		this.carritoid = carritoid;
		this.userid = userid;
		this.fechacreacion = fechacreacion;
	}


	@Override
	public String toString() {
		return "CarritoCompras [carritoid=" + carritoid + ", userid=" + userid + ", fechacreacion=" + fechacreacion
				+ "]";
	}


	public CarritoCompras() {
		// TODO Auto-generated constructor stub
	}


	public CarritoCompras(long carritoid2, int userid2, String string) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
