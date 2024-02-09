package com.product.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.manager.entity.ProductFamily;
import com.product.manager.entity.response.QueryProductFamily;

@Repository
public interface QuerytProductFamilyRepository extends JpaRepository<ProductFamily, Integer> {
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and UPPER(a.codigo) like UPPER(CONCAT('%', :codigo, '%')) \r\n"
			+ "and UPPER(a.nombre) like UPPER(CONCAT('%', :nombre, '%')) \r\n"
			+ "and a.activo = :activo "
			, nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndNombreAndActivo(@Param("codigo") String codigo,
    																	  @Param("nombre") String nombre,
    																	  @Param("activo") boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n" 
			+ "and UPPER(a.codigo) like UPPER(CONCAT('%', :codigo, '%')) \r\n" 
			+ "and UPPER(a.nombre) like UPPER(CONCAT('%', :nombre, '%')) \r\n" ,
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndNombre(@Param("codigo") String codigo,
    															 @Param("nombre") String nombre);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and UPPER(a.codigo) like UPPER(CONCAT('%', :codigo, '%')) \r\n"
			+ "and a.activo = :activo ",
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigoAndActivo(@Param("codigo") String codigo,
    														     @Param("activo") boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and UPPER(a.codigo) like UPPER(CONCAT('%', :codigo, '%')) \r\n",
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByCodigo(@Param("codigo") String codigo);
	
	@Query(value = "select a.id_familia as idFamilia,\r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and UPPER(a.nombre) like UPPER(CONCAT('%', :nombre, '%')) \r\n"
			+ "and a.activo = :activo ",
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByNombreAndActivo(@Param("nombre") String nombre,
    														     @Param("activo") boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia, \r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and UPPER(a.nombre) like UPPER(CONCAT('%', :nombre, '%')) \r\n",
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByNombre(@Param("nombre") String nombre);
	
	@Query(value = "select a.id_familia as idFamilia, \r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia \r\n"
			+ "and a.activo = :activo ",
			nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByActivo(@Param("activo") boolean activo);
	
	@Query(value = "select a.id_familia as idFamilia, \r\n"
			+ "b.codigo as codigoFamiliaProducto, \r\n"
			+ "b.nombre as nombreFamiliaProducto, \r\n"
			+ "b.activo as activoFamiliaProducto, \r\n"
			+ "b.fecha_creacion as fechaCreacionFamiliaProducto, \r\n"
			+ "a.id_producto as idProducto, \r\n"
			+ "a.codigo as codigoProducto, \r\n"
			+ "a.nombre as nombreProducto, \r\n"
			+ "a.precio as precio, \r\n"
			+ "a.stock as stock, \r\n"
			+ "a.activo as activoProducto, \r\n"
			+ "a.fecha_creacion as fechaCreacionProducto \r\n"
			+ "from product a, product_family b \r\n"
			+ "where b.id_familia = a.id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamily();
	
	@Query(value = "select\r\n"
			+ "        a.id_familia as idFamilia,\r\n"
			+ "        b.codigo as codigoFamiliaProducto,\r\n"
			+ "        b.nombre as nombreFamiliaProducto,\r\n"
			+ "        b.activo as activoFamiliaProducto,\r\n"
			+ "        b.fecha_creacion as fechaCreacionFamiliaProducto,\r\n"
			+ "        a.id_producto as idProducto,\r\n"
			+ "        a.codigo as codigoProducto,\r\n"
			+ "        a.nombre as nombreProducto,\r\n"
			+ "        a.precio as precio,\r\n"
			+ "        a.stock as stock,\r\n"
			+ "        a.activo as activoProducto,\r\n"
			+ "        a.fecha_creacion as fechaCreacionProducto   \r\n"
			+ "    from\r\n"
			+ "        product a,\r\n"
			+ "        product_family b   \r\n"
			+ "    where\r\n"
			+ "        b.id_familia = a.id_familia and  \r\n"
			+ "        b.id_familia = :id_familia", nativeQuery = true)
    List<QueryProductFamily> queryProductFamilyByIdFamilia(@Param("id_familia") int idFamilia);
	

	
}
