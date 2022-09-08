package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeServiceImpl  implements EmployeeService{

	HashMap<String,Employee> list = new HashMap<String,Employee>();
	
	//Add employee to HashMap list
	public void addEmployee(Employee emp) {
		list.put(emp.getName(),emp);
	}
	
	//Display Employee having given insurance scheme	
	public void displayEmpFromInsurance(String scheme) {		
		for(Entry<String,Employee> set :  list.entrySet() ) {
			if( set.getValue().getInsuranceScheme().compareTo(scheme)==0) {
				System.out.println(set.getValue());
			}
		}
	}
	
	//Delete employee by id passed
	public boolean deleteEmployee(int id) {
		for(Entry<String,Employee> set :  list.entrySet() ) {
			if( set.getValue().getId()==id) {
				list.remove(set.getValue().getName(), set.getValue());
				return true;
			}
		}
		return false;
	}
	
	//Sort Employees by salary
	public void sortEmployeeBySalary() {
		Set <Employee> set = new TreeSet<>(new SalaryComparator());
		set.addAll(list.values());
		for(Employee e : set) {
			System.out.println(e);
		}
	}
	
	//Display list of employees
	public void displayList() {
		for(Entry<String,Employee> set :  list.entrySet() ) {
			System.out.println(set.getValue());
		}
	}
	
	//Get Employee Details
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
