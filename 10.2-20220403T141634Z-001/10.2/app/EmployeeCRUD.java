package com.training.app;

import java.util.Scanner;

import com.training.entities.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;
import com.training.service.EntryNotFoundException;



public class EmployeeCRUD {


		private static EmployeeService service =  new EmployeeServiceImpl();
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("1.Add an employee");
			System.out.println("2.delete an employee by id");
			System.out.println("3.List an employee by scheme");
			System.out.println("4.List all employee");
			System.out.println("5.Sort the employee details based on salary");
			System.out.println("Enter choice");
			int choice = new Scanner(System.in).nextInt();
			
			switch (choice) {
			case 1: Employee addEmployee = acceptDetails();
					addEmployee=service.addEmployee(addEmployee);
					System.out.println("added "+addEmployee);
					break;
			          
			case 2 : System.out.println("Enter Employee id ");
			int idd = new Scanner(System.in).nextInt();
			
			try {
				Employee a2 = service.deleteEmployee(idd);
			} catch (EntryNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());;
			}
			break;
			case 3:
			System.out.println("Enter employee scheme ");
			String s = new Scanner(System.in).next();
			try {
				System.out.println(service.listEmployeeByScheme(s));
			} catch (EntryNotFoundException e) {
				// TODO Auto-generated catch block
			 System.out.println(e.getMessage());
			}
			break;
			case 4:System.out.println(service.listAllEmployee());
			break;
			case 5:
				System.out.println(service.sortlistAllEmployee());
				break;
     		default : 
				System.out.println("Invalid choice");
				System.exit(0);
		
			}       
	}
		

		private static Employee acceptDetails() {
			
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter id");
			long id =  scanner.nextLong();
			System.out.println("Enter name");
			String name = scanner.next();
			System.out.println("Enter salary");
			double s=scanner.nextDouble();
			System.out.println("Enter designation");
			String d = scanner.next();
			System.out.println("Enter insurancescheme");
			String is = scanner.next();
	        
	        Employee e= new Employee(id,s,name,d,is);
	        return e;
				
			}
	}


