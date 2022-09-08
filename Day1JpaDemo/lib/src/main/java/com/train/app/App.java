package com.train.app;

import java.util.List;
import java.util.Scanner;

import com.train.dao.JPAUtility;
import com.train.entities.Person;
import com.train.exception.IDNotFoundException;
import com.train.service.PersonService;
import com.train.service.PersonServiceImpl;

public class App {
	private static PersonService service = new PersonServiceImpl();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Person Management");
		System.out.println("1.Add Person details");
		System.out.println("2.List All persons");
		System.out.println("3.List person by Id");
		System.out.println("4.Delete Person by Id");
		System.out.println("5.Update Person by Id");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter name:");
			String name1 = sc.next();		
			Person p = new Person(name1);
			Person p1 = service.addPerson(p);
			System.out.println("Person added:\n"+p1);				
			break;
			
		case 2:
				List<Person> lst = service.listAllPerson();
				for(Person p2 : lst) {
					System.out.println(p2);
				}
			break;
			
		case 3:
			System.out.println("Enter Id:");
			int id1 = sc.nextInt();
			Person p3 = null;
			try {
				p3 = service.listById(id1);
				System.out.println("The person with ID="+id1+" is: "+p3);
			} 
			catch (IDNotFoundException e) {
				System.out.println(e.getMessage());				
			}
			break;
			
		case 4:
			System.out.println("Enter Id for deletion:");
			int id2 = sc.nextInt();
			Person p4 = null;
			try {
				p4 = service.deletePersonById(id2);	
				System.out.println("The deleted Person with ID="+id2+" is: "+p4);
			} 
			catch (IDNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 5:			
			Person res_p5 = null;
			try {
				System.out.println("Enter Id for Updation:");
				int id3 = sc.nextInt();
				Person p5 = service.listById(id3);		
				System.out.println("Previous name was: "+p5.getName());
				System.out.println("Enter new Name:");
				String newName = sc.next();
				p5.setName(newName);
				res_p5 = service.updatePersonById(p5);	
				System.out.println("The Updated Person with ID="+id3+" is: "+res_p5);
			} 
			catch (IDNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		default:
			System.out.println("Invalid Choice!");
			System.exit(0);
		}
		JPAUtility.close();
	}
}
