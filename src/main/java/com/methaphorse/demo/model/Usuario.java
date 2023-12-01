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
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	
	@Column(name = "nombreusuario")
	private String nombreusuario;
	
	@Column(name = "contrasena")
	private String contrasena;
	
	@Column(name = "correoelectronico")
	private String correoelectronico;
	
	@Column(name = "rolid")
	private int rolid;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public int getRolid() {
		return rolid;
	}

	public void setRolid(int rolid) {
		this.rolid = rolid;
	}

	public Usuario(Long userid, String nombreusuario, String contrasena, String correoelectronico, int rolid) {
		super();
		this.userid = userid;
		this.nombreusuario = nombreusuario;
		this.contrasena = contrasena;
		this.correoelectronico = correoelectronico;
		this.rolid = rolid;
	}

	@Override
	public String toString() {
		return "usuario [userid=" + userid + ", nombreusuario=" + nombreusuario + ", contrasena=" + contrasena
				+ ", correoelectronico=" + correoelectronico + ", rolid=" + rolid + "]";
	}

	public Usuario() {
	}
	
	

}
