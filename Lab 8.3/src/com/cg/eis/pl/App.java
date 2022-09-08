package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.exception.EmployeeException;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl services = new EmployeeServiceImpl();

		Employee e1 = services.getDetails();
		services.displayDetails(e1);		
		System.out.println("-----------------------------------");
		e1.setInsuranceScheme(services.findInsuranceScheme(e1));	
		services.displayDetails(e1);
		System.out.println("-----------------------------------");
		
		//Write to File
		services.writeToFile(e1);
		
		//Read from file
		String filepath = "C:\\Users\\shard\\eclipse-workspace\\temp\\Employee";
		System.out.println(services.readFromFile(filepath));

		sc.close();
	}	
}
