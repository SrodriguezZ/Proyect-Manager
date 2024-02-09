package com.product.manager.service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.InvoiceHeader;

import com.product.manager.repository.InvoiceDetailRepository;
import com.product.manager.repository.InvoiceHeaderRepository;

@Service
public class InvoiceHeaderService {


	@Autowired
	InvoiceHeaderRepository invoiceHeaderRepository;
	
	@Autowired
	InvoiceDetailRepository invoiceDetailRepository;
	
	public InvoiceHeader save(InvoiceHeader invoiceHeader) {
		
		invoiceHeader.setFechaCreacion(LocalDate.now());
		 return invoiceHeaderRepository.save(invoiceHeader);
	}
	
	public void delete(int id) {
		invoiceDetailRepository.deleteAllByIdFactura(id);
		invoiceHeaderRepository.deleteById(id);
	}
	public Optional<InvoiceHeader> findById(int id) {
		return invoiceHeaderRepository.findById(id);
	}
	
	public List<InvoiceHeader> getAll(){
		return invoiceHeaderRepository.findAll();
	}
	
	
}
