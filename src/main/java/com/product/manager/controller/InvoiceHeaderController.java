package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.product.manager.entity.InvoiceHeader;
import com.product.manager.entity.InvoiceNumberSequence;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.InvoiceHeaderService;
import com.product.manager.service.InvoiceNumberSequenceService;



@RestController
@RequestMapping("/invoice/header")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class InvoiceHeaderController {
	
	@Autowired
	InvoiceHeaderService invoiceHeaderService;
	
	@Autowired
	InvoiceNumberSequenceService invoiceNumberSequenceService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public InvoiceHeader save(@RequestBody InvoiceHeader invoiceHeader) {
			 return invoiceHeaderService.save(invoiceHeader);
			
	}
	//Get SequenceNumber
	@GetMapping("/numberid")
	@ResponseStatus(HttpStatus.OK)
	public InvoiceNumberSequence getSequence() {
		return invoiceNumberSequenceService.getSequenceId();
	}
	
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public InvoiceHeader getIdInvoice(@PathVariable("id") int id) {
		return invoiceHeaderService.findById(id).orElseThrow(()-> new  ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value()));
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<InvoiceHeader> getAll(){
		try {
			return invoiceHeaderService.getAll();
		} catch (Exception e) {
			new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteid(@PathVariable("id") int id) {
		try {
			invoiceHeaderService.delete(id);
		} catch (Exception e) {
			new ProductManagerException("Id a eliminar no se encuentra registrado: ", id + HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		
	}
	
	
}
