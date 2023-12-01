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
@Table(name = "transaccion")
@EntityListeners(AuditingEntityListener.class)
public class Transaccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transaccionid;

	// userid
	@Column(name = "userid")
	private int userid;

	// fechacompra
	@Column(name = "fechacompra")
	private String fechacompra;

	// direccionenvio
	@Column(name = "direccionenvio")
	private String direccionenvio;

	// informacionpago
	@Column(name = "informacionpago")
	private String informacionpago;

	
	//montototal
		@Column(name = "montototal")
		private float montototal;
		
		
		//estado
				@Column(name = "estado")
				private String estado;


		public Long getTransaccionid() {
			return transaccionid;
		}


		public void setTransaccionid(Long transaccionid) {
			this.transaccionid = transaccionid;
		}


		public int getUserid() {
			return userid;
		}


		public void setUserid(int userid) {
			this.userid = userid;
		}


		public String getFechacompra() {
			return fechacompra;
		}


		public void setFechacompra(String fechacompra) {
			this.fechacompra = fechacompra;
		}


		public String getDireccionenvio() {
			return direccionenvio;
		}


		public void setDireccionenvio(String direccionenvio) {
			this.direccionenvio = direccionenvio;
		}


		public String getInformacionpago() {
			return informacionpago;
		}


		public void setInformacionpago(String informacionpago) {
			this.informacionpago = informacionpago;
		}


		public float getMontototal() {
			return montototal;
		}


		public void setMontototal(float montototal) {
			this.montototal = montototal;
		}


		public Transaccion(Long transaccionid, int userid, String fechacompra, String direccionenvio,
				String informacionpago, float montototal) {
			super();
			this.transaccionid = transaccionid;
			this.userid = userid;
			this.fechacompra = fechacompra;
			this.direccionenvio = direccionenvio;
			this.informacionpago = informacionpago;
			this.montototal = montototal;
		}


		

		public Transaccion(Long transaccionid, int userid, String fechacompra, String direccionenvio,
				String informacionpago, float montototal, String estado) {
			super();
			this.transaccionid = transaccionid;
			this.userid = userid;
			this.fechacompra = fechacompra;
			this.direccionenvio = direccionenvio;
			this.informacionpago = informacionpago;
			this.montototal = montototal;
			this.estado = estado;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public Transaccion() {
			// TODO Auto-generated constructor stub
		}
	
		
		
		
		
}
