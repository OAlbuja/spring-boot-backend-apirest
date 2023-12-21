package com.udla.springboot.backend.apirest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidCedulaException.class)
    public ResponseEntity<String> handleInvalidCedulaException(InvalidCedulaException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidEmailException.class)
    public ResponseEntity<String> handleInvalidEmailException(InvalidEmailException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<String> handleInvalidNameException(InvalidNameException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidSurnameException.class)
    public ResponseEntity<String> handleInvalidSurnameException(InvalidSurnameException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    // Aquí se pueden agregar manejadores para otras excepciones si lo necesitas
}
