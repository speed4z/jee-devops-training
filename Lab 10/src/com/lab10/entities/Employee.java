package com.lab10.entities;

public class Employee {

	private long id;
	private double salary;
	private String name,designation,insuranceScheme;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Employee(long id, double salary, String name, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id +  ", name=" + name +", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

	public Employee(long id, double salary, String name, String designation) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
	}


}
