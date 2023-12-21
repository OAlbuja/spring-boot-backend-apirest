package com.udla.springboot.backend.apirest.exceptions;

public class InvalidSurnameException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
	
	public InvalidSurnameException(String message) {
        super(message);
    }
}