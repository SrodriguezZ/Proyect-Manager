package com.product.manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Getter;

@Entity
@Table(name = "invoice_numer_sequence")

public class InvoiceNumberSequence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSecuenciaNumeroFactura;

	public int getIdSecuenciaNumeroFactura() {
		return idSecuenciaNumeroFactura;
	}

	public void setIdSecuenciaNumeroFactura(int idSecuenciaNumeroFactura) {
		this.idSecuenciaNumeroFactura = idSecuenciaNumeroFactura;
	}
	
	

}
