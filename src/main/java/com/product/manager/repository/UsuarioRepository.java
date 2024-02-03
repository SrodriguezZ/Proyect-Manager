package com.product.manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.manager.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	

	@Query("SELECT u FROM Usuario u WHERE u.username = ?1 AND u.password = ?2")
	Optional<Usuario> findByUsernameAndPassword(String username, String password);
	
	Usuario findByUsername(String usernmae);

}
