package com.product.manager.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.product.manager.entity.Usuario;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void loginUsuario(Usuario usuario) {
		
		Usuario user = usuarioRepository.findByUsername(usuario.getUsername());
        if (user != null && !user.isBloqueado() && validarUsuario(usuario, user)) {
        	user.setIntentosError(0);
        	usuarioRepository.save(user);
            System.out.println("Ingreso ok");
        } else {

            
            if (user.isBloqueado()) {
                throw new ProductManagerException.CuentaBloqueadaException("Cuenta bloqueada, contactate con soporte");
            }

            if (user != null) {
                user.setIntentosError(user.getIntentosError()+1);
                
                if (user.getIntentosError() >= 3) {
                    user.setBloqueado(true);;
                }

                usuarioRepository.save(user);
            }

            
            	throw new ProductManagerException.CuentaCredencialException("Usuario o contraseña incorrecta");

        }
    }
   
    public static boolean validarUsuario(Usuario usuario, Usuario user) {
        return usuario.getUsername().equals(user.getUsername()) && usuario.getPassword().equals(user.getPassword());
    }
}
