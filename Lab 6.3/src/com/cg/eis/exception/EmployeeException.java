package com.cg.eis.exception;

public class EmployeeException {
	
	public void validateSalary(double salary) throws SalaryException{
		if(salary < 3000) {
			throw new SalaryException("Salary can not be less than 3000");
		}
	}
	
	public double checkSalary(double salary) {
		System.out.println("Validating salary!");
		try {
			validateSalary(salary);
		}
		catch(SalaryException s) {
			System.out.println(s);
			return -1;
		}
		return salary;
	}
}
