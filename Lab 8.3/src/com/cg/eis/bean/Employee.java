package com.cg.eis.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int id=1;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	//Constructors
	public Employee() {
		id++;
	}
	public Employee(String name, String designation) {
		super();
		id++;;
		this.name = name;
		this.designation = designation;
	}
	
	public Employee(String name, double salary) {
		super();
		id++;;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee( String name, double salary, String designation) {
		super();
		id++;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	public Employee(String name, double salary, String designation, String insuranceScheme) {
		super();
		id++;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	//toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

}
