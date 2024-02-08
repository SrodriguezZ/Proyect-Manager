package com.product.manager.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.InvoiceDetail;
import com.product.manager.repository.InvoiceDetailRepository;

@Service
public class InvoiceDetailService {
	
	@Autowired
	private InvoiceDetailRepository invoiceDetaiRepository;
	
	public void save( List<InvoiceDetail> invoiceDetail) {
		for(InvoiceDetail invoiceDet:invoiceDetail) {
			invoiceDet.setFechaCreacion(LocalDate.now());
			invoiceDetaiRepository.save(invoiceDet);
		}
		
	}
	
	public void delete(int id) {
		invoiceDetaiRepository.deleteById(id);
	}
}
