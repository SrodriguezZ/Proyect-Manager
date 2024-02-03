package com.product.manager.handler;

public class ProductManagerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int statusCode;
	
	public ProductManagerException(String mensaje, int statusCode) {
        super(mensaje);
        this.statusCode = statusCode;
    }
	
	public int getStatusCode() {
        return this.statusCode;
    }

}
