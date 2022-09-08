package com.sprint1.apps;

import java.util.List;
import java.util.Scanner;
import com.sprint1.entities.Applicant;
import com.sprint1.exception.EntityNotFoundException;
import com.sprint1.service.ApplicantService;
import com.sprint1.service.ApplicantServiceImpl;

public class ApplicantCRUD {
private static ApplicantServiceImpl service =  new ApplicantServiceImpl();

	public static void main(String[] args) {
		System.out.println("1.Add an applicant");
		System.out.println("2.update an applicant");
		System.out.println("3.delete an applicant");
		System.out.println("4.List an applicant");
		System.out.println("5.List all applicants");
		System.out.println("Enter choice");
		int choice = new Scanner(System.in).nextInt();
		
		switch (choice) {	
		
		case 1 : Applicant addApplicant = service.createApplicant();
        Applicant a1 =service.addApplicant(addApplicant);
        System.out.println(a1);
        break;
		
		case 2 : Applicant updatedByUserApplicant = service.acceptDetails();
		          Applicant a2 =service.updateApplicant(updatedByUserApplicant);
		          System.out.println(a2);
		          break;
		          
		case 3 : 
			System.out.println("For deleting:");
			long id1 = service.acceptId();
			try {
				Applicant a3 =service.deleteApplicant(id1);
			} catch (EntityNotFoundException e) {
				e.printStackTrace();
			}			
        break;
        
		case 4 :
			System.out.println("For details:");
			long id2 = service.acceptId();
			try {
				Applicant a4 =service.listApplicantById(id2);
				System.out.println(a4);
			} catch (EntityNotFoundException e) {
				e.printStackTrace();
			}			
        break;
        
		case 5 :
			System.out.println("Details of all applicants:");
			List <Applicant> lst1 = service.listAllApplicants();
			System.out.println(lst1);
        break;
		          
		default : 
			System.out.println("Invalid choice");
			System.exit(0);			
		}       
	}	
}
