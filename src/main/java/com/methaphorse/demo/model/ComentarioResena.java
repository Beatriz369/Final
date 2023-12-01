package com.methaphorse.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "comentarioresena")
@EntityListeners(AuditingEntityListener.class)

public class ComentarioResena {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//comentarioid
	private Long comentarioid;

	// userid
	@Column(name = "userid")
	private int userid;

	// productoid
	@Column(name = "productoid")
	private int productoid;

	// comentario
	@Column(name = "comentario")
	private String comentario;

	// calificacion
	@Column(name = "calificacion")
	private int calificacion;

	// fechacreacion
	@Column(name = "fechacreacion")
	private Date fechacreacion;

	public Long getComentarioid() {
		return comentarioid;
	}

	public void setComentarioid(Long comentarioid) {
		this.comentarioid = comentarioid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public ComentarioResena(Long comentarioid, int userid, int productoid, String comentario, int calificacion,
			Date Date) {
		super();
		this.comentarioid = comentarioid;
		this.userid = userid;
		this.productoid = productoid;
		this.comentario = comentario;
		this.calificacion = calificacion;
		this.fechacreacion = Date;
	}

	@Override
	public String toString() {
		return "ComentarioResena [comentarioid=" + comentarioid + ", userid=" + userid + ", productoid=" + productoid
				+ ", comentario=" + comentario + ", calificacion=" + calificacion + ", fechacreacion=" + fechacreacion
				+ "]";
	}

	public ComentarioResena() {
		// TODO Auto-generated constructor stub
	}

	public ComentarioResena(long comentarioid2, int userid2, int productoid2, String comentario2, int calificacion2,
			String string) {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
