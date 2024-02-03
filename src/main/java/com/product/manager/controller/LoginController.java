package com.product.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.manager.entity.Usuario;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/ingreso")
	public  ResponseEntity<String> login(@RequestBody Usuario usuario) {
		try {
			loginService.loginUsuario(usuario);
			return new ResponseEntity<>("Ingreso Ok", HttpStatus.ACCEPTED);
		} catch (ProductManagerException.CuentaBloqueadaException e) {
			return new ResponseEntity<>("Cuenta Bloqueda" , HttpStatus.FORBIDDEN );
		}catch (ProductManagerException.CuentaCredencialException e) {
			return new ResponseEntity<>("Credencial Incorrecta" , HttpStatus.UNAUTHORIZED );
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
