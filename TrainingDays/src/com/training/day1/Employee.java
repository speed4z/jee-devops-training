package com.training.day1;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private LocalDate dateOfJoining;
	
	//Setters and Getters
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
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}	
	
	//Constructors
	public Employee(){}		
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, double salary, LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}
	
}
