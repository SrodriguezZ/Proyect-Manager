package com.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.manager.entity.InvoiceHeader;

public interface InvoiceHeaderRepository extends JpaRepository<InvoiceHeader, Integer>{
	
}
