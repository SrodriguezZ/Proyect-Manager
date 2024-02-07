package com.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.InvoiceNumberSequence;
@Repository
public interface InvoiceNumberSequenceRepository extends JpaRepository<InvoiceNumberSequence, Integer>{

}
