package com.springlab.q4;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public Employee displayEmployeeDetails(int id) throws EmpNotFoundException {
		// TODO Auto-generated method stub
		return dao.displayEmployee(id);
	}

}