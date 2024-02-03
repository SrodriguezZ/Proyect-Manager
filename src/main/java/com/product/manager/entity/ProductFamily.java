package com.product.manager.entity;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "product_family")
public class ProductFamily {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFamilia;
	
	@Column(length = 15)
	@Size(max = 15, message = "El campo 'codigo' debe tener un m�ximo de 15 caracteres.")
    @Pattern(regexp = "^[A-Za-z0-9]*$", message = "El campo 'codigo' debe contener solo letras y n�meros.")
	private String codigo;
	
	private String nombre;
	
	private boolean activo;
	
	private LocalDate fechaCreacion;

	public int getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



}
