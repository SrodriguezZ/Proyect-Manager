package com.product.manager.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	@NotBlank(message = "El campo no puede ser nulo o vacio")
	private String username;
	@NotBlank(message = "El campo no puede ser nulo o vacio")
	private String password;
	
	private int intentosError;
	private boolean bloqueado = false;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIntentosError() {
		return intentosError;
	}
	public void setIntentosError(int intentosError) {
		this.intentosError = intentosError;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	

	
}
