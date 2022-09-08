package com.training.service;

import java.util.List;

import com.training.entities.Employee;



public interface EmployeeService {

	Employee addEmployee(Employee employee);
	Employee deleteEmployee(long id) throws EntryNotFoundException;
	Employee listEmployeeByScheme(String sc) throws EntryNotFoundException;
	List<Employee> listAllEmployee();
	List<Employee> sortlistAllEmployee();

}
