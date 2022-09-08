package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class EmployeeServiceImpl  implements EmployeeService{
	
	//Write to File
	public void writeToFile(Employee e1) {
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\shard\\eclipse-workspace\\temp\\Employee");
	            ObjectOutputStream objectOut = new ObjectOutputStream(fos);){
			
            objectOut.writeObject(e1);
            objectOut.close();
            System.out.println("The Object written to a file"); 
        } 
		catch (IOException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//Read from file
	 public Object readFromFile(String filepath) {
		 
	        try (FileInputStream fileIn = new FileInputStream(filepath);
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);) {
	        	
	            Object obj = objectIn.readObject();	 
	            System.out.println("The Object has been read from the file");
	            objectIn.close();
	            return obj;	 
	        } 
	        catch (FileNotFoundException e) {
				System.out.println(e);
				// TODO Auto-generated catch block
				e.printStackTrace();				
			} 
	        catch (IOException e) {
				System.out.println(e);
				// TODO Auto-generated catch block
				e.printStackTrace();				
			} 
	        catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return null;
	    }

	@Override
	public Employee getDetails() {
		String name,designation;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();		
		System.out.println("Enter Designation");
		designation = sc.nextLine();
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		
		EmployeeException validateSal = new EmployeeException();
		salary = validateSal.checkSalary(salary);
		
		if(salary == -1) {
			return new Employee (name,designation);
		}
		
		sc.close();
		return new Employee (name,salary,designation);
	}
	
	@Override
	public String findInsuranceScheme(Employee e ) {
		double salary = e.getSalary();
		String designation = e.getDesignation();
		String insurance="";
		
		if(salary >= 40000 |designation.equals("Manager")) {
			insurance = "Scheme A";
			}
		
		else if((salary >= 20000 && salary < 40000) |designation.equals("Programmer")) {
			insurance = "Scheme B";
			}
		
		else if((salary >= 5000 && salary < 20000) |designation.equals("System Associate")) {
			insurance = "Scheme C";
			}
		
		if(salary < 5000 |designation.equals("Clerk")) {
			insurance = "No Scheme";
			}
		
		e.setInsuranceScheme(insurance);
		return insurance;
	}

	@Override
	public void displayDetails(Employee a) {
		System.out.println(a);
	}

}
