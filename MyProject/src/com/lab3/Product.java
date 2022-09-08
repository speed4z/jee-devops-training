package com.lab3;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter purchase date  in dd/MM/yyyy format");
		String d1 = sc.nextLine();		
		LocalDate purchaseDate = LocalDate.parse(d1,formatter);
		
		System.out.println("Enter warranty period  in MM/yy format");
		String d2 = sc.nextLine();
		String []warranty = d2.split("/");
		
			int expDay  = 	(purchaseDate.getDayOfMonth()) ;
			int expMonth = (purchaseDate.getMonthValue()+ Integer.parseInt(warranty[0]));			
			int expYear = (purchaseDate.getYear()+Integer.parseInt(warranty[1]));
			if(expMonth > 12) {
				expYear +=1;
				expMonth = expMonth-12;
			}		
			
			String eDay = Integer.toString(expDay);
			if(eDay.length()==1) {
				eDay = "0"+eDay;
			}
			String eMonth = Integer.toString(expMonth);	
				if(eMonth.length()==1) {
					eMonth = "0"+eMonth;
				}
			String eYear = Integer.toString(expYear);
				
			String d3 = eDay+'/'+eMonth+'/'+eYear;
					
		LocalDate expiryDate = LocalDate.parse(d3,formatter);
		
		System.out.println("Expiry date of product is\n"+expiryDate);
	sc.close();
	}
}
