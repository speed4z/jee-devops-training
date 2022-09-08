package com.springlab.q4;

public interface EmployeeDao {
	Employee displayEmployee(int id) throws EmpNotFoundException;
}
