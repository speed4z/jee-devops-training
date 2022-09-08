package com.training.lambda;

import java.util.function.Supplier;

@FunctionalInterface
interface EmployeeCRUD{
	public void addEmployee(Employee e);
}


public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,20000,"John","admin","Premium"); 		
		
		EmployeeCRUD crud1 = new EmployeeCRUD() {
			@Override
			public void addEmployee(Employee e) {
				System.out.println("Employee added using Anonymous Impl:");
				System.out.println(e);
			}
		};
		
		crud1.addEmployee(e1);			

		EmployeeCRUD crud2 = (Employee e)->{System.out.println("Employee added using lambda:\n"+e);};
		
		crud2.addEmployee(new Employee(2,25000,"sam","John","class1"));
		
		
		
		class EmployeeCRUDImpl implements EmployeeCRUD{

			@Override
			public void addEmployee(Employee e) {
				System.out.println("Employee added:");
				System.out.println(e);
			}			
		}	
		EmployeeCRUDImpl impl = new EmployeeCRUDImpl();
		
	}

}
