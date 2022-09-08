package com.training.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
 
@ControllerAdvice
public class DeptControllerAdvice {

    @ExceptionHandler(value=DepartmentNotFoundException.class)
    public ResponseEntity<Object> exception(DepartmentNotFoundException excep){

        return new ResponseEntity<>("Department not found",HttpStatus.NOT_FOUND);

    }

}