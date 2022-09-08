package com.training.regex;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Employee e1=new Employee();
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		if(validateName(name)) {
			e1.setName(name);
		}
		else {
			System.out.println("Invalid format! Data not set.");
		}
		
		System.out.println("Enter date of Joining dd/MM/yyyy");
		String doj = sc.nextLine();
		if(validateDoj(doj)) {
			LocalDate dojoin = LocalDate.parse(doj,formatter);
			e1.setDoj(dojoin);
		}
		else {
			System.out.println("Invalid format! Data not set.");
		}
		 
		System.out.println("Enter Salary in format 99999.99");
		String salary = sc.nextLine();
		if(validateSalary(salary)) {
			e1.setSalary(salary);
		}
		else {
			System.out.println("Invalid format! Data not set.");
		}
		
		System.out.println(e1);
		sc.close();			
	}
	
	public static boolean validateName(String name) {
		Pattern p1 = Pattern.compile("^[[a-zA-Z][ ]]*$");
		Matcher m1 = p1.matcher( name);
		if(m1.find()) {
			return true;
		}
		return false;		
	}
	
	public static boolean validateDoj(String doj) {
		Pattern p2 = Pattern.compile("^(3?[01]|12[0-9]|0[1-9])/(1?[0-2]|0[1-9])/(20)[0-9]{2}$");
		Matcher m2 = p2.matcher(doj);
		if(m2.find()) {
			return true;
		}
		return false;		
	}
	
	
	public static boolean validateSalary(String salary) {
		Pattern p3 = Pattern.compile("^(\\d{5}).(\\d{2})$");
		Matcher m3 = p3.matcher(salary);
		if(m3.find()) {
			return true;
		}
		return false;		
	}
}
