package com.lab2;

import java.util.Scanner;

public class PersonMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Person p1 = new Person("Sam","Will",Gender.M,22,75.0);
		System.out.println(p1);
		
		System.out.println("\nEnter phone number");
		String phone = sc.next();
		
		p1.setMobile_number(phone);
		System.out.println(p1.personalDetails());

		sc.close();
		}	
}
