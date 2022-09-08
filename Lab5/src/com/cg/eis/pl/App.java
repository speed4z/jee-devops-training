package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class App {
	public static void main(String[] args) {
		EmployeeServiceImpl services = new EmployeeServiceImpl();

		Employee e1 = services.getDetails();
		services.displayDetails(e1);		
		System.out.println("-----------------------------------");
		e1.setInsuranceScheme(services.findInsuranceScheme(e1));	
		services.displayDetails(e1);			

	}	
}
