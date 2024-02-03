package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.product.manager.entity.Product;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private Product update(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private List<Product> getAll() {
		return productService.getAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	private Product getById(@PathVariable("id") int id) {
		return productService.findById(id).orElseThrow(() -> new ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value()));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	private void delete(@PathVariable("id") int id) {
		productService.findById(id).orElseThrow(() -> new ProductManagerException("Id a eliminar no se encuentra registrado: " + id, HttpStatus.INTERNAL_SERVER_ERROR.value()));
		productService.delete(id);
	}

}
