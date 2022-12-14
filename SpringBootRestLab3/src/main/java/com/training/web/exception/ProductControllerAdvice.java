package com.training.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

 
@ControllerAdvice
public class ProductControllerAdvice {
	
	 @ExceptionHandler(value=ProductNotFoundException.class)
	 public ResponseEntity<Object> exception(ProductNotFoundException excep){

	        return new ResponseEntity<>("Product not found",HttpStatus.NOT_FOUND);

	 }
}
