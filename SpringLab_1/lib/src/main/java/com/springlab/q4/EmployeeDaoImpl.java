
package com.springlab.q4;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee displayEmployee(int id) throws EmpNotFoundException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Employee e1 = context.getBean("emp3", Employee.class);
		Employee e2 = context.getBean("emp4", Employee.class);
		Employee e3 = context.getBean("emp5", Employee.class);
		Employee e4 = (Employee) context.getBean("emp6");
		Employee e5 = (Employee) context.getBean("emp7");
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5);
		Employee emp = null;
		for(int i=0; i<empList.size();i++) {
			if(empList.get(i).getId()==id) {
				emp=empList.get(i);
				break;
			}
		}
		if(emp==null) {
			throw new EmpNotFoundException("Employee with this id does not exist"); 
		}
		return emp;
	}

}