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
@Table(name = "tipoproducto")
@EntityListeners(AuditingEntityListener.class)
public class TipoProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tipoproductoid;
	
	@Column(name = "nombrecategoria")
	private String nombrecategoria;

	public Long getTipoproductoid() {
		return tipoproductoid;
	}

	public void setTipoproductoid(Long tipoproductoid) {
		this.tipoproductoid = tipoproductoid;
	}

	public String getNombrecategoria() {
		return nombrecategoria;
	}

	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}

	public TipoProducto(Long i, String nombrecategoria) {
		super();
		this.tipoproductoid = i;
		this.nombrecategoria = nombrecategoria;
	}

	@Override
	public String toString() {
		return "TipoProducto [tipoproductoid=" + tipoproductoid + ", nombrecategoria=" + nombrecategoria + "]";
	}

	public TipoProducto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
