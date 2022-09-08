package com.sprint1.apps;

import java.util.Scanner;

import com.sprint1.entities.Applicant;
import com.sprint1.exception.EntityNotFoundException;
import com.sprint1.service.ApplicantService;
import com.sprint1.service.ApplicantServiceImpl;

public class ApplicantCRUD {
private static ApplicantService service =  new ApplicantServiceImpl();

	public static void main(String[] args) {
		System.out.println("1.Add an applicant");
		System.out.println("2.update an applicant");
		System.out.println("3.delete an applicant");
		System.out.println("4.List an applicant");
		System.out.println("5.List all applicants");
		System.out.println("Enter choice");
		int choice = new Scanner(System.in).nextInt();
		
		switch (choice) {
		
		case 2 : Applicant updatedByUserApplicant = acceptDetails();
		          Applicant a =service.updateApplicant(updatedByUserApplicant);
		          System.out.println(a);
		          break;
		default : 
			System.out.println("Invalid choice");
			System.exit(0);
		
		
		
}       
	}
	
	private static Applicant acceptDetails() {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter id to be updated ");
		int id =  scanner.nextInt();
		
	   Applicant retrievedData = null;
	try {
		retrievedData = service.listApplicantById(id);
	} catch (EntityNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
		System.out.println("Enter new phone Number");
		String phnum =  scanner.next();
		System.out.println("Enter new email ");
        String em =  scanner.next();
     retrievedData.setPhoneNumber(phnum); 
     retrievedData.setEmailId(em);
     return retrievedData;
     
	}

}
