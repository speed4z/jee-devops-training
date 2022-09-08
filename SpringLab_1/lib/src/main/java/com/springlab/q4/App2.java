package com.springlab.q4;

import java.util.Scanner;

public class App2 {
	public static EmployeeService service = new EmployeeServiceImpl();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		
		Employee emp;
		try {
			emp = service.displayEmployeeDetails(id);
			System.out.println("Displaying employee details: ");
			System.out.println("========================================");
			System.out.println("ID: "+emp.getId());
			System.out.println("Name: "+emp.getName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("========================================");
			
		} catch (EmpNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}