package com.lab14.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
		Department dept1 = new Department(1,"comp",1);
		Department dept2 = new Department(2,"Sales",2);
		Department dept3 = new Department(3,"test",3);		
		
		
		Employee e1 = new Employee(1,"sam","sung","sam@g.com","12345678",LocalDate.of(2021, 01, 01),"prog",30000.0,1,dept1);
		Employee e2 = new Employee(1,"john","cena","john@g.com","23125678",LocalDate.of(2022, 03, 01),"admin",40000.0,2,dept2);
		Employee e3 = new Employee(1,"ram","anna","ram@g.com","12513278",LocalDate.of(2020, 01, 01),"prog",40000.0,1,dept1);
		Employee e4 = new Employee(1,"mike","bhosale","mike@g.com","11242378",LocalDate.of(2020, 03, 01),"test",25000.0,3,dept3);
		Employee e5 = new Employee(1,"soham","dcruz","soham@g.com","98745678",LocalDate.of(2022, 03, 01),"sales",30000.0,2,dept2);
		Employee e6 = new Employee(1,"sid","leclerk","sid@g.com","98745178",LocalDate.of(2022, 01, 01),"test",20000.0,3,dept3);	
		
		
		public List<Employee> getEmpList(){
			List<Employee> empList = new ArrayList<>();
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
			empList.add(e4);
			empList.add(e5);
			empList.add(e6);
			
			return empList;
		}
		
		
}
