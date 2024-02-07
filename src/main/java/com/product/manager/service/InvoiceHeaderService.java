package com.product.manager.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.InvoiceHeader;
import com.product.manager.repository.InvoiceDetaiRepository;
import com.product.manager.repository.InvoiceHeaderRepository;

@Service
public class InvoiceHeaderService {

	@Autowired
	private InvoiceHeaderRepository invoiceHeaderRepository;
	@Autowired
	private InvoiceDetaiRepository invoiceDetaiRepository;
	

	public void saveInvoiceHeader(InvoiceHeader invoiceHeader) {
		invoiceHeader.setFechaCreacion(LocalDate.now());
		invoiceHeaderRepository.save(invoiceHeader);
	}

	public void deleteId(int id) {

		invoiceDetaiRepository.deleteAllByIdFactura(id);
		invoiceHeaderRepository.deleteById(id);
	}
}
