package com.lab10.services;

import java.util.List;

import com.lab10.dao.EmployeeDAO;
import com.lab10.dao.EmployeeDAOImpl;
import com.lab10.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 dao.addEmployee(employee);
			return employee;
	}

	@Override
	public Employee deleteEmployee(long id) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public Employee listEmployeeByScheme(String sc) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		return dao.listEmployeeByScheme(sc);
	}

	@Override
	public List<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		return dao.listAllEmployee();
	}

	@Override
	public List<Employee> sortlistAllEmployee() {
		// TODO Auto-generated method stub
		return dao.sortlistAllEmployee();
	}

}
