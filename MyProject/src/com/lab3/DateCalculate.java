package com.lab3;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateCalculate {	
	
	public static void main(String []args) {		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter date1  in dd/MM/yyyy format");
		String d1 = sc.nextLine();		
		LocalDate date1 = LocalDate.parse(d1,formatter);
		System.out.println(date1.toString());
		
		System.out.println("Enter date2 in dd/MM/yyyy format");
		String d2 = sc.nextLine();		
		LocalDate date2 = LocalDate.parse(d2,formatter);
		
		calculatePeriod(LocalDate.now(),date1);
		calculatePeriod(date1,date2);
		sc.close();
	}
	
	public static void calculatePeriod(LocalDate date1, LocalDate date2) {
		LocalDate start = date1;
		LocalDate end = date2;
		
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());			
	}
}
