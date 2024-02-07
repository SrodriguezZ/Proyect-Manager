package com.product.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.InvoiceNumberSequence;
import com.product.manager.repository.InvoiceNumberSequenceRepository;

@Service
public class InvoiceNumberSequenceService {

	@Autowired
	private InvoiceNumberSequenceRepository invoiceNumberSequenceRepository;

	public InvoiceNumberSequence getSequenceId() {
		InvoiceNumberSequence invoiceNumberSequenceSave = new InvoiceNumberSequence();
		InvoiceNumberSequence invoiceNumberSequenceResult = new InvoiceNumberSequence();
		// Return secuence
		int sequence = invoiceNumberSequenceRepository.save(invoiceNumberSequenceSave).getIdSecuenciaNumeroFactura();
		invoiceNumberSequenceResult.setIdSecuenciaNumeroFactura(sequence);
		return invoiceNumberSequenceResult;
	}
}
