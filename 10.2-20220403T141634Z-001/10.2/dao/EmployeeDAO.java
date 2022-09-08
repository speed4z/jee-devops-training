package com.training.dao;

import java.util.List;

import com.training.entities.Employee;
import com.training.service.EntryNotFoundException;


public interface EmployeeDAO {

	Employee addEmployee(Employee employee);
	Employee deleteEmployee(long id) throws EntryNotFoundException;
	Employee listEmployeeByScheme(String sc) throws EntryNotFoundException;
	List<Employee> listAllEmployee();
	List<Employee> sortlistAllEmployee();

}
