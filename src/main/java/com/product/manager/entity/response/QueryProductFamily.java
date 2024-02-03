package com.product.manager.entity.response;

import java.util.Date;

public interface QueryProductFamily{
	
	int getIdFamilia();
	
	String getCodigoFamiliaProducto();
	
	String getNombreFamiliaProducto();
	
	boolean getActivoFamiliaProducto();
	
	Date getFechaCreacionFamiliaProducto();
	
	int getIdProducto();
	
	String getCodigoProducto();
	
	String getNombreProducto();
	
	int getPrecio();
	
	int getStock();
	
	boolean getActivoProducto();
	
	Date getFechaCreacionProducto();
	
}
