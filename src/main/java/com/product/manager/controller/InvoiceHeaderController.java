package com.product.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.product.manager.entity.InvoiceHeader;
import com.product.manager.entity.InvoiceNumberSequence;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.InvoiceHeaderService;
import com.product.manager.service.InvoiceNumberSequenceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("invoice/header")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class InvoiceHeaderController {
	
	@Autowired
	private InvoiceNumberSequenceService invoiceNumberSequenceService;
	
	@Autowired
	private InvoiceHeaderService invoiceHeaderService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void save(@RequestBody InvoiceHeader invoiceHeader) {
		try {
			invoiceHeaderService.saveInvoiceHeader(invoiceHeader);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/numberid")
	@ResponseStatus(HttpStatus.OK)
	public InvoiceNumberSequence getSequence() {
		return invoiceNumberSequenceService.getSequenceId();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteid(@PathVariable("id") int id) {
		try {
			invoiceHeaderService.deleteId(id);
		} catch (Exception e) {
			new ProductManagerException("Id a eliminar no se encuentra registrado: ", id + HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		
	}
	
	
}
