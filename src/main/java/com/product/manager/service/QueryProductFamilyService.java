package com.product.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.entity.request.RequestQueryProductFamily;
import com.product.manager.entity.response.QueryProductFamily;
import com.product.manager.repository.QuerytProductFamilyRepository;

import lombok.extern.log4j.Log4j2;


@Service
public class QueryProductFamilyService {
	
	 @Autowired
	 QuerytProductFamilyRepository querytFamilyProductRepository;

	 public List<QueryProductFamily> getQueryProductFamily(RequestQueryProductFamily requestQueryProductFamily) {
		 	
		 if( 
				 (!isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (!isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (!isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByCodigoAndNombreAndActivo(
					 requestQueryProductFamily.getCodigoProducto(),
					 requestQueryProductFamily.getNombreProducto(),
					 Boolean.parseBoolean(requestQueryProductFamily.getActivoProducto())
					 );
		 };
		 
		 if( 
				 (!isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (!isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByCodigoAndNombre(
					 requestQueryProductFamily.getCodigoProducto(),
					 requestQueryProductFamily.getNombreProducto()
					 );
		 };
		 
		 if( 
				 (!isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (!isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			
			 return querytFamilyProductRepository.queryProductFamilyByCodigoAndActivo(
					 requestQueryProductFamily.getCodigoProducto(),
					 Boolean.parseBoolean(requestQueryProductFamily.getActivoProducto())
					 );
		 };
		 
		 if( 
				 (!isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByCodigo(
					 requestQueryProductFamily.getCodigoProducto()
					 );
		 };
		 
		 
		 if( 
				 (isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (!isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (!isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByNombreAndActivo(
					 requestQueryProductFamily.getNombreProducto(),
					 Boolean.parseBoolean(requestQueryProductFamily.getActivoProducto())
					 );
		 };
		 
		 if( 
				 (isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (!isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByNombre(
					 requestQueryProductFamily.getNombreProducto()
					 );
		 };
		 
		 if( 
				 (isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (!isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamilyByActivo(
					 Boolean.parseBoolean(requestQueryProductFamily.getActivoProducto())
					 );
		 };
		 
		 if( 
				 (isNull(requestQueryProductFamily.getCodigoProducto())) && 
				 (isNull(requestQueryProductFamily.getNombreProducto())) && 
				 (isNull(requestQueryProductFamily.getActivoProducto()))
		   ) {
			 
			 return querytFamilyProductRepository.queryProductFamily();
		 };
		 
		 return querytFamilyProductRepository.queryProductFamily();
	 }
	 //static null
	 public static boolean isNull(String value) {
		    return value == null;
		}

}
