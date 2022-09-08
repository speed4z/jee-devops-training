package com.springlab.q2;

public class Employee2 {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;	
	
	public Employee2() {}

	public Employee2(int employeeId, String employeeName, double salary, SBU businessUnit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
	}

	public Employee2(String employeeName, double salary, SBU businessUnit) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
	}

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

	public SBU getBusinessUnit() {
		return businessUnit;
	}
	
	public SBU getSbuDetails() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + "]";
	}
	
}
