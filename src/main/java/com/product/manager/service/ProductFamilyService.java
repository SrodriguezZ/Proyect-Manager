package com.product.manager.service;

import java.lang.StackWalker.Option;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.product.manager.entity.ProductFamily;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.repository.ProductFamilyRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductFamilyService {
	
	@Autowired
	private ProductFamilyRepository productFamilyRepository;
	
	public ProductFamily save(ProductFamily productFamily) {

		//LocalDate fechaCreacion = LocalDate.now();s

		//productFamily.setFechaCreacion(fechaCreacion);
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

	public void updateProduct(int id, ProductFamily productFamily) {
		Optional<ProductFamily> product = productFamilyRepository.findById(id);
		product.ifPresentOrElse(productUpdate->{
			productUpdate.setNombre(productFamily.getNombre());
			productUpdate.setCodigo(productFamily.getCodigo());
			productUpdate.setActivo(productFamily.isActivo());
			productUpdate.setFechaCreacion(productFamily.getFechaCreacion());
			productFamilyRepository.save(productUpdate);
		},()->{
			 new ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value());
		});
	}

}
