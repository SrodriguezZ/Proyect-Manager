package com.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.InvoiceHeader;

@Repository
public interface InvoiceHeaderRepository extends JpaRepository<InvoiceHeader, Integer>{
	
}
