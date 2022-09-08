package com.vehicle.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class VehicleControllerAdvice {
	
	 @ExceptionHandler(value=VehicleNotFoundException.class)
	 public ResponseEntity<Object> exception(VehicleNotFoundException excep){

	        return new ResponseEntity<>("Vehicle not found",HttpStatus.NOT_FOUND);

	 }
}
