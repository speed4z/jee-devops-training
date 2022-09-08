package com.sprint1.dao;

import java.util.List;

import com.sprint1.entities.Applicant;
import com.sprint1.exception.EntityNotFoundException;

public interface ApplicantDAO {
	
	Applicant addApplicant(Applicant applicant);
	Applicant updateApplicant(Applicant applicant);
	Applicant deleteApplicant(long id) throws EntityNotFoundException;
	Applicant listApplicantById(long id) throws EntityNotFoundException;
	List<Applicant> listAllApplicants();
	
    
}
