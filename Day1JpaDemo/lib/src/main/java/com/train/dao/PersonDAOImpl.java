package com.train.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.train.entities.Person;
import com.train.exception.IDNotFoundException;

public class PersonDAOImpl implements PersonDAO{
	private EntityManager em =JPAUtility.getEntityManager();
	
	@Override
	public Person addPerson(Person p) {
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		em.persist(p);		
		tr.commit();
		
		return p;		
	}

	@Override
	public List<Person> listAllPerson() {
		//create query is taking objects not tables of rdbms
				//jpa create query will return a query object
				//internally it will query				
				//select * from Project_Person				
				Query query =  em.createQuery("from Person p");				
				return query.getResultList();
	}

	@Override
	public Person listById(int id) throws IDNotFoundException{
		Person p = em.find(Person.class, id);
	     if (p==null) {	    	 
	    	 throw new IDNotFoundException("person with this id not found");
	     }return p;
	}

	@Override
	public Person deletePersonById(int id) throws IDNotFoundException {
		EntityTransaction tr = em.getTransaction();
		Person p = em.find(Person.class, id);
		
		if (p==null) {	    	 
	    	 throw new IDNotFoundException("person with this id not found");
	     }else {
	    	 tr.begin();
	    	 em.remove(p);
	    	 tr.commit();
	     }
   	 return p;
	}

	@Override
	public Person updatePersonById(Person p) throws IDNotFoundException {
		EntityTransaction tr = em.getTransaction();
		Person per = em.find(Person.class, p.getId());
		
		if (per==null) {	    	 
	    	 throw new IDNotFoundException("person with this id not found");
	     }else {
	    	 tr.begin();
	    	 per.setName(p.getName());
	    	 tr.commit();
	     }
   	 return per;
	}
}
