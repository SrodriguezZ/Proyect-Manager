package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.product.manager.entity.ProductFamily;
import com.product.manager.handler.ProductManagerException;
import com.product.manager.service.ProductFamilyService;

@RestController
@RequestMapping("/family/product")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class ProductFamilyController {
	
	@Autowired
	private ProductFamilyService productManagerService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private ProductFamily save(@RequestBody ProductFamily prodctFamily) {
		return productManagerService.save(prodctFamily);
	}
	
	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	private void update(@PathVariable("id") int id, @RequestBody ProductFamily productFamily ) {
		productManagerService.updateProduct(id, productFamily);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private List<ProductFamily> getAll() {
		return productManagerService.getAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	private ProductFamily getById(@PathVariable("id") int id) {
		return productManagerService.findById(id).orElseThrow(() -> new ProductManagerException("Id no encontrado: " + id, HttpStatus.NOT_FOUND.value()));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	private void delete(@PathVariable("id") int id) {
		productManagerService.findById(id).orElseThrow(() -> new ProductManagerException("Id a eliminar no se encuentra registrado: " + id, HttpStatus.INTERNAL_SERVER_ERROR.value()));
		productManagerService.delete(id);
	}
	
	@DeleteMapping("/all/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteId(@PathVariable("id") int id) {
		try {
			productManagerService.deleteFk(id);
		} catch (Exception e) {
			new ProductManagerException("Id a eleminar no se encuentra registrado: ", id + HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
	}
	
	

}
