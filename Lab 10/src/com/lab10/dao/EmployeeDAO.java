package com.lab10.dao;

import java.util.List;

import com.lab10.entities.Employee;
import com.lab10.services.EntryNotFoundException;


public interface EmployeeDAO {

	Employee addEmployee(Employee employee);
	Employee deleteEmployee(long id) throws EntryNotFoundException;
	Employee listEmployeeByScheme(String sc) throws EntryNotFoundException;
	List<Employee> listAllEmployee();
	List<Employee> sortlistAllEmployee();

}
