package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

import java.util.*;

public class EmployeeServiceImpl  implements EmployeeService{

	@Override
	public Employee getDetails() {
		String name,designation;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();		
		System.out.println("Enter Designation");
		designation = sc.nextLine();
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		
		EmployeeException validateSal = new EmployeeException();
		salary = validateSal.checkSalary(salary);
		
		if(salary == -1) {
			return new Employee (name,designation);
		}
		
		sc.close();
		return new Employee (name,salary,designation);
	}
	
	@Override
	public String findInsuranceScheme(Employee e ) {
		double salary = e.getSalary();
		String designation = e.getDesignation();
		String insurance="";
		
		if(salary >= 40000 |designation.equals("Manager")) {
			insurance = "Scheme A";
			}
		
		else if((salary >= 20000 && salary < 40000) |designation.equals("Programmer")) {
			insurance = "Scheme B";
			}
		
		else if((salary >= 5000 && salary < 20000) |designation.equals("System Associate")) {
			insurance = "Scheme C";
			}
		
		if(salary < 5000 |designation.equals("Clerk")) {
			insurance = "No Scheme";
			}
		
		e.setInsuranceScheme(insurance);
		return insurance;
	}

	@Override
	public void displayDetails(Employee a) {
		System.out.println(a);
	}

}
