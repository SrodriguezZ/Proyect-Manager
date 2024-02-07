package com.product.manager.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.InvoiceDetail;
import com.product.manager.repository.InvoiceDetaiRepository;

@Service
public class InvoiceDetailService {
	
	@Autowired
	private InvoiceDetaiRepository invoiceDetaiRepository;
	
	public void save(InvoiceDetail invoiceDetail) {
		invoiceDetail.setFechaCreacion(LocalDate.now());
		invoiceDetaiRepository.save(invoiceDetail);
	}
	
	public void delete(int id) {
		invoiceDetaiRepository.deleteById(id);
	}
}
