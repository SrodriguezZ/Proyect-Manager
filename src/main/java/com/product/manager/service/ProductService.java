package com.product.manager.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.Product;
import com.product.manager.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {

		LocalDate fechaCreacion = LocalDate.now();
		product.setFechaCreacion(fechaCreacion);
		

		return productRepository.save(product);
	}
	
	public Product update(Product product) {
		
		return productRepository.save(product);
	}
	
	public List<Product> getAll() {
		
		return productRepository.findAll();
	}
	
	public Optional<Product> findById(int id) {
		
		return productRepository.findById(id);
	}
	
	public void delete(int id) {
		
		productRepository.deleteById(id);;
	}

}
