package com.lab14.lambdas;

import java.util.Scanner;

@FunctionalInterface
interface ValidateUser{
	boolean validate(String s1,String s2);
}

public class App3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter username:");
		String user = sc.next();
		System.out.println("Enter password:");
		String pass = sc.next();
		
		//Validation = true if user name and password is "admin".
		ValidateUser v1 = (String s1,String s2)->{
			if(s1.equals("admin") && s2.equals("admin")) return true;
			return false;};
			
			System.out.println(v1.validate(user, pass));	
	}
}
