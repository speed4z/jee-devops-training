package com.training.regex;

import java.time.LocalDate;

public class Employee {
	static int id ;
	String name;
	LocalDate doj;
	String salary;
	
	//Setters Getters
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	//Constructor
	public Employee() {
		id++;
	}
	
	public Employee(String name, LocalDate doj, String salary) {
		super();
		id++;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}

	//toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", doj=" + doj + ", salary=" + salary + "]";
	}
		
}
