package com.training.web.exception;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException() {
		super();
		
	}
	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
