package com.train.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.train.entities.Greet;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence	.createEntityManagerFactory("test2");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Greet greet = new Greet();
		greet.setMessage("Welcome to JPA!");
		
		em.persist(greet);
		
		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
