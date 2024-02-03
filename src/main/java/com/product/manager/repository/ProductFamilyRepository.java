package com.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.ProductFamily;

@Repository
public interface ProductFamilyRepository extends JpaRepository<ProductFamily, Integer> {

}
