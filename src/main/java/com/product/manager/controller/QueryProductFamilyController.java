package com.product.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.product.manager.entity.request.RequestQueryProductFamily;
import com.product.manager.entity.response.QueryProductFamily;
import com.product.manager.service.QueryProductFamilyService;

@RestController
@RequestMapping("query/family/product")
@CrossOrigin(originPatterns = {"http://localhost:4200/"})
public class QueryProductFamilyController {
	
	@Autowired
	private QueryProductFamilyService queryProductFamilyService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private List<QueryProductFamily> getQueryProductFamily(
			@RequestParam(value = "codigoProducto", required = false) String codigoProducto,
            @RequestParam(value = "nombreProducto", required = false) String nombreProducto,
            @RequestParam(value = "activo", required = false) String activo
			) {
				RequestQueryProductFamily requestQueryProductFamily = new RequestQueryProductFamily();
				requestQueryProductFamily.setCodigoProducto(codigoProducto);
				requestQueryProductFamily.setNombreProducto(nombreProducto);
				requestQueryProductFamily.setActivoProducto(activo);
			
		return queryProductFamilyService.getQueryProductFamily(requestQueryProductFamily);
	}

}
