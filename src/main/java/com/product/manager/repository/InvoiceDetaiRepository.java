package com.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.InvoiceDetail;

import jakarta.transaction.Transactional;

@Repository
public interface InvoiceDetaiRepository extends JpaRepository<InvoiceDetail, Integer>{

	
	@Transactional
	@Modifying
	@Query(value = "delete from invoice_detail id where id_factura = :id_factura", nativeQuery = true)
	public void deleteAllByIdFactura(@Param("id_factura") int id);
}
