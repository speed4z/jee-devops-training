package com.lab10.services;

import java.util.List;

import com.lab10.entities.Employee;



public interface EmployeeService {

	Employee addEmployee(Employee employee);
	Employee deleteEmployee(long id) throws EntryNotFoundException;
	Employee listEmployeeByScheme(String sc) throws EntryNotFoundException;
	List<Employee> listAllEmployee();
	List<Employee> sortlistAllEmployee();

}
