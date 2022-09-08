package com.lab14.stream;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class EmployeeService {	
		
//		System.out.println(empList);
		
		public double sumSalary(List<Employee> empList) {
			double ans = 0;
			ans = empList.stream()
					.mapToDouble(Employee::getSalary)
		             .reduce(0, (value1, value2) -> value1 + value2);  
			
			return ans;
		}
		
		public Map<String,Integer> deptNameCount(List<Employee> empList){
			Map<String,Integer> deptCount = new HashMap<>();
			
			Map<String,List<Employee>> deptList =
					empList.stream()
		.collect(Collectors.groupingBy((e)->e.getDepartment().getDepartmentName()));
			
			for(String s : deptList.keySet()) {
				deptCount.put(s, deptList.get(s).size());
			}
			return deptCount;
		}
		
		public Employee seniorEmp(List<Employee> empList){
			Employee e= null;
			Function <Employee,LocalDate> byPeriod = emp->emp.getHireDate();
			
			List<Employee> list = empList.stream().Collectors.sort(empList,Comparator.comparing(byPeriod));
					
							
				return e;
		}

}
