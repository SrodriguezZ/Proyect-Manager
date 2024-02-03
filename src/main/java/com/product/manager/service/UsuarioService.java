package com.product.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.Usuario;
import com.product.manager.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	  @Autowired
	  private UsuarioRepository usuarioRepository;
	  
	  public void save(Usuario usuario) {
		  usuarioRepository.save(usuario);
	  }

	  public List<Usuario> getAll () {
		return usuarioRepository.findAll();
		
	  }
		 
	  public void delete(int id) {
		   usuarioRepository.deleteById(id);
	  }
	  
	  public Optional<Usuario> findById(int id){
		  return usuarioRepository.findById(id);
	  }
}
