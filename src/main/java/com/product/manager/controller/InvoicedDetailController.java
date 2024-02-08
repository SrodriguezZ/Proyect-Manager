package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.product.manager.entity.InvoiceDetail;
import com.product.manager.service.InvoiceDetailService;



@RestController
@RequestMapping("invoice/detail")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class InvoicedDetailController {
	
	@Autowired
	private InvoiceDetailService invoiceDetailService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//Array - Frontend
	public void save(@RequestBody List<InvoiceDetail> invoiceDetail) {
		try {
			invoiceDetailService.save(invoiceDetail);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
