package com.springlab.q3;

import org.springframework.stereotype.Component;

@Component
public class Employee2 {
	int employeeId;
	String employeeName;
	double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	public Employee2(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
