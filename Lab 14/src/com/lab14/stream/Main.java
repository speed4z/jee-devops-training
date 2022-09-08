package com.lab14.stream;

import java.util.List;

public class Main {
	
	static EmployeeRepository empRep = new EmployeeRepository();		
	static List<Employee> empList = empRep.getEmpList();
	
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		System.out.println("Sum of all salaries:");
		System.out.println(service.sumSalary(empList));
		System.out.println("---------------------");
		
		System.out.println("Count of all Depts:");
		System.out.println(service.deptNameCount(empList));
		System.out.println("---------------------");
		
		System.out.println("Senior most employee:");
		System.out.println(service.seniorEmp(empList));
		System.out.println("---------------------");
	}
}
