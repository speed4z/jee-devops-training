package com.jpa.app;

import java.util.List;
import java.util.Scanner;

import com.jpa.dao.IDNotFoundException;
import com.jpa.dao.JPAUtility;
import com.jpa.entities.Author;
import com.jpa.service.AuthorService;
import com.jpa.service.AuthorServiceImpl;

public class App {
	private static AuthorService service = new AuthorServiceImpl();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Person Management");
		System.out.println("1.Add Author");
		System.out.println("2.List all Authors");
		System.out.println("3.Delete Author");		
		System.out.println("4.Update Author");	
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter First name:");
			String fname1 = sc.next();		
			System.out.println("Enter Middle name:");
			String mname1 = sc.next();	
			System.out.println("Enter Last name:");
			String lname1 = sc.next();
			System.out.println("Enter Phone number:");
			String ph = sc.next();
			Author a = new Author(fname1,mname1,lname1,ph);
			Author a1 = service.addAuthor(a);
			System.out.println("Author added:\n"+a1);				
			break;
			
		case 2:
				List<Author> lst = service.listAllAuthor();
				for(Author a2 : lst) {
					System.out.println(a2);
				}
			break;
			
		case 3:
			System.out.println("Enter Id:");
			int id1 = sc.nextInt();
			Author a3 = null;
			try {
				a3 = service.deleteAuthor(id1);
				System.out.println("The person deleted with ID="+id1+" is: "+a3);
			} 
			catch (IDNotFoundException e) {
				System.out.println(e.getMessage());				
			}
			break;
			
		case 4:
			System.out.println("Enter Id:");
			int id2 = sc.nextInt();
			Author res_a4 = null;
			try {
				Author a4 = service.listById(id2);
				System.out.println("Previous data: "+a4);
				System.out.println("Enter First name:");
				String fname2 = sc.next();		
				System.out.println("Enter Middle name:");
				String mname2 = sc.next();	
				System.out.println("Enter Last name:");
				String lname2 = sc.next();
				System.out.println("Enter Phone number:");
				String ph2 = sc.next();
				a4.setFirstName(fname2);
				a4.setLastName(lname2);
				a4.setMiddleName(mname2);
				a4.setPhoneNo(ph2);
				
				res_a4 = service.updateAuthor(a4);
				System.out.println("The person updated with ID="+id2+" is: "+a4);
			} 
			catch (IDNotFoundException e) {
				System.out.println(e.getMessage());				
			}
			break;
			
			
			default:
				System.out.println("Invalid choice!");
				System.exit(0);			
		}	
		JPAUtility.close();
	}
}
