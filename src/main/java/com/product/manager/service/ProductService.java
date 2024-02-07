package com.product.manager.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.product.manager.entity.Product;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {

		LocalDate fechaCreacion = LocalDate.now();
		product.setFechaCreacion(fechaCreacion);
		

		return productRepository.save(product);
	}
	
	public void update(int id,Product product) {
		Optional<Product> productid = productRepository.findById(id);
		productid.ifPresentOrElse(productPresent ->{
			productPresent.setActivo(product.isActivo());
			productPresent.setCodigo(product.getCodigo());
			productPresent.setFechaCreacion(product.getFechaCreacion());
			productPresent.setNombre(product.getNombre());
			productPresent.setPrecio(product.getPrecio());
			productPresent.setStock(product.getStock());
		}, ()->{
			new ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value());
		});
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
	
	public void updateStock(int id, int stock) {
		if(productRepository.updateStock(id, stock)>0) {
			System.out.print("EL Stock del producto [" + id + "]Fue acutalizado con exito" );
		}else {
			System.out.print("EL Stock del producto [" + id + "]No fue actualizado,por favor verifcar" );
		}
	}

}
