package com.product.manager.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idProducto;
	
	@Column(length = 15, unique = true)
	@Size(max = 15, message = "El campo 'codigo' debe tener un m�ximo de 15 caracteres.")
    @Pattern(regexp = "^[A-Za-z0-9]*$", message = "El campo 'codigo' debe contener solo letras y n�meros.")
	private String codigo;
	
	private String nombre;
	
	private int idFamilia;
	
	private int precio;
	
	private int stock;
	
	private boolean activo;
	
	private LocalDate fechaCreacion;
	
	
}
