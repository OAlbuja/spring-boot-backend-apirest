package com.udla.springboot.backend.apirest.exceptions;

public class InvalidCedulaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

    public InvalidCedulaException(String message) {
        super(message);
    }
}
