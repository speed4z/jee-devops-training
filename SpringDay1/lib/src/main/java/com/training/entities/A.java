package com.training.entities;

class B implements Printable{

	@Override
	public void print() {
		System.out.println("print B");
		
	}
	

}

public class A implements Printable{

	@Override
	public void print() {
		System.out.println("print A");
		
	}
	

}