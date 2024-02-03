package com.product.manager.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.product.manager.entity.Message;

@ControllerAdvice
public class ProductManagerAdvice {
	
	@ExceptionHandler(ProductManagerException.class)
    public ResponseEntity<Object> handlerException(ProductManagerException ex) {
		Message responseMessage = new Message();
		responseMessage.setStatusCode(ex.getStatusCode());
		responseMessage.setMessage(ex.getMessage());
		return new ResponseEntity<>(responseMessage, HttpStatus.valueOf(ex.getStatusCode()));
    }

}
