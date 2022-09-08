package com.sprint1.service;

import java.util.List;
import java.util.Scanner;

import com.sprint1.dao.ApplicantDAO;
import com.sprint1.dao.ApplicantDAOImpl;
import com.sprint1.entities.Applicant;
import com.sprint1.exception.EntityNotFoundException;

//unit testing 
//should he be able to test the service layer in isolation of db layer
//when we say unit testing 
//each and every developer
//should be able to test their codes

public class ApplicantServiceImpl  implements ApplicantService{
	
	//service consumes DAO layer 
	private ApplicantDAO dao = new ApplicantDAOImpl();
	Scanner sc = new Scanner(System.in);
	
	public Applicant createApplicant() {			
		System.out.println("Enter ID");	
		long id = sc.nextLong();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Phone Number");
		String phoneNumber = sc.next();
		System.out.println("Enter Email Id");
		String emailId = sc.next();
		Applicant temp = new Applicant(id,name,phoneNumber,emailId);
		return temp;
	}
	
	public long acceptId() {
		System.out.println("Enter ID:");
		long id= sc.nextLong();
		return id;
	}
	
	public Applicant acceptDetails() {		
		Scanner sc = new Scanner(System.in);		
		
		Applicant temp = new Applicant();
		return temp;
	}
	

	@Override
	public Applicant addApplicant(Applicant applicant) {
		
		 dao.addApplicant(applicant);
		return applicant;
	}

	@Override
	public Applicant updateApplicant(Applicant applicant) {
		
	 applicant = dao.updateApplicant(applicant);
		return applicant;
	}

	@Override
	public Applicant deleteApplicant(long id) throws EntityNotFoundException {
		
		return dao.deleteApplicant(id);
	}

	@Override
	public Applicant listApplicantById(long id) throws EntityNotFoundException {
		
		return dao.listApplicantById(id);
	}

	@Override
	public List<Applicant> listAllApplicants() {
		
		return dao.listAllApplicants();
	}

}
