package com.product.manager.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.ProductFamily;
import com.product.manager.repository.ProductFamilyRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductFamilyService {
	
	@Autowired
	private ProductFamilyRepository productFamilyRepository;
	
	public ProductFamily save(ProductFamily productFamily) {

		LocalDate fechaCreacion = LocalDate.now();

		productFamily.setFechaCreacion(fechaCreacion);
		return productFamilyRepository.save(productFamily);
	}
	
	public ProductFamily update(ProductFamily productFamily) {
		
		return productFamilyRepository.save(productFamily);
	}
	
	public List<ProductFamily> getAll() {
		
		return productFamilyRepository.findAll();
	}
	
	public Optional<ProductFamily> findById(int id) {
		
		return productFamilyRepository.findById(id);
	}
	
	public void delete(int id) {
		
		productFamilyRepository.deleteById(id);;
	}

}
