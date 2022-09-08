package com.train.service;

import java.util.List;

import com.train.dao.PersonDAO;
import com.train.dao.PersonDAOImpl;
import com.train.entities.Person;
import com.train.exception.IDNotFoundException;

public class PersonServiceImpl implements PersonService{

	private PersonDAO dao = new PersonDAOImpl();
	
	@Override
	public Person addPerson(Person p) {
		
		return dao.addPerson(p);
	}

	@Override
	public List<Person> listAllPerson() {
		
		return dao.listAllPerson();
	}

	@Override
	public Person listById(int id)  throws IDNotFoundException {
		
		return dao.listById(id);
	}

	@Override
	public Person deletePersonById(int id) throws IDNotFoundException {

		return dao.deletePersonById(id);
	}

	@Override
	public Person updatePersonById(Person p) throws IDNotFoundException {
		
		return dao.updatePersonById(p);
	}

}
