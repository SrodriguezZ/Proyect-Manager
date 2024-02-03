package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.product.manager.entity.Usuario;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.UsuarioService;




@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void save(@RequestBody Usuario usuario) {
		try {
			usuarioService.save(usuario);
		} catch (Exception e) {
			throw new ProductManagerException("Error al momento de guardar: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Usuario> listUser(){
		try {
			return usuarioService.getAll();
			
		} catch (Exception e) {
			 throw new ProductManagerException("Error en lista "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	private void deleteUser(@PathVariable("id")int id ) {
		usuarioService.findById(id).orElseThrow(()-> new ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value()));
		usuarioService.delete(id) ;
	}
	
	
}
