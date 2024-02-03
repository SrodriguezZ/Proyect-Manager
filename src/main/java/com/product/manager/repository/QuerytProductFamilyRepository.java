package com.product.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.ProductFamily;
import com.product.manager.entity.response.QueryProductFamily;

@Repository
public interface QuerytProductFamilyRepository extends JpaRepository<ProductFamily, Integer> {
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndNombreAndActivo(String codigo, String nombre, boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndNombre(String codigo, String nombre);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndActivo(String codigo, boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigo(String codigo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByNombreAndActivo(String nombre, boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByNombre(String nombre);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByActivo(boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto\r\n"
			+ "from product a, product_family b\r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamily();
	
	/*
	 ALTER TABLE product MODIFY COLUMN fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP;
	 ALTER TABLE product_family MODIFY COLUMN fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP;
	 */
	
}
