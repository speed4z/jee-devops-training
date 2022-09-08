package com.cg.eis.service;


import com.cg.eis.bean.Employee;

public interface EmployeeService {
	Employee getDetails();
	String findInsuranceScheme(Employee e);
	void displayDetails(Employee e);
}
