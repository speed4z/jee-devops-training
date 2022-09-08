package com.training.day4;

public class App {	
	public static void main(String[] args) {
			ValidateUser validate =new ValidateUser();
			User sam = validate.createUser("Sam","Abcd@1234");
			System.out.println("User created:\n"+sam);
	}
}
