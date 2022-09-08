package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

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

		Employee e2 = new Employee("Ram",10000.0,"Programmer","Scheme B");
		Employee e3 = new Employee("Sam",25000.0,"Manager","Scheme A");
		Employee e4 = new Employee("Nick",8000.0,"Associate","Scheme C");
		Employee e5 = new Employee("Harsh",5000.0,"Clerk","No Scheme");
		
		services.addEmployee(e1);
		services.addEmployee(e2);
		services.addEmployee(e3);
		services.addEmployee(e4);
		services.addEmployee(e5);
		
		System.out.println("==============Sort by salary===============");
		services.sortEmployeeBySalary();
		
		System.out.println("===accept insurance scheme and show emp details===");
		String scheme = sc.nextLine();
		services.displayEmpFromInsurance(scheme);
		
		System.out.println("=========== delete by ID=============");
		System.out.println("Before deleting");
		System.out.println();
		services.displayList();
		System.out.println("After deleting id 3");
		System.out.println();
		services.deleteEmployee(3);
		services.displayList();		
		sc.close();
	}	
}
