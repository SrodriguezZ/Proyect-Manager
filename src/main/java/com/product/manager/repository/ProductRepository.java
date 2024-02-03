package com.product.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.manager.entity.Product;
import com.product.manager.entity.response.QueryProductFamily;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "SELECT * FROM mi_tabla WHERE condicion = :condicion", nativeQuery = true)
    List<QueryProductFamily> encontrarPorCondicion(String condicion);
	
}
