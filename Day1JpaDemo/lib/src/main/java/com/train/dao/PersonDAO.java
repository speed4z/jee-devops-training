package com.train.dao;

import java.util.List;

import com.train.entities.Person;
import com.train.exception.IDNotFoundException;

public interface PersonDAO {
	Person addPerson(Person p);	
	List<Person> listAllPerson();	
	Person listById(int id) throws IDNotFoundException;
	Person deletePersonById(int id) throws IDNotFoundException;
	Person updatePersonById(Person p) throws IDNotFoundException;
}
