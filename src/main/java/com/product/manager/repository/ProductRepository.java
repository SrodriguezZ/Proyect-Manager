package com.product.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.Product;
import com.product.manager.entity.response.QueryProductFamily;


import jakarta.transaction.Transactional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "update product set stock = stock -(:stock) where id_producto  = :id", nativeQuery = true)
	int updateStock(@Param("id") int idProducto, @Param("stock") int stock);
	
	
	@Transactional
	@Modifying
	@Query(value = "delete from product id where id_familia = :id_familia", nativeQuery = true)
	public void deleteAllByIdFamily_Product(@Param("id_familia") int id);
	
	@Query(value = "SELECT * FROM product WHERE condicion = :condicion", nativeQuery = true)
    List<QueryProductFamily> encontrarPorCondicion(String condicion);
	
	
	
}
