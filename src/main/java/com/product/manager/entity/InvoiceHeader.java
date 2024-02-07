package com.product.manager.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class InvoiceHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFactura;
	
	@Column(unique = true)
	private int numeroFacutra;
	
	@Size(min = 13, max = 13, message = "El ruc debe tener 13 caracteres")
	private String ruc;
	
	private String razonSocial;

	private Double subtotal;

	private Double porcentajeIgv;
	
	private Double igv;
	
	private Double total;
	
	private LocalDate fechaCreacion;

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getNumeroFacutra() {
		return numeroFacutra;
	}

	public void setNumeroFacutra(int numeroFacutra) {
		this.numeroFacutra = numeroFacutra;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getPorcentajeIgv() {
		return porcentajeIgv;
	}

	public void setPorcentajeIgv(Double porcentajeIgv) {
		this.porcentajeIgv = porcentajeIgv;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
