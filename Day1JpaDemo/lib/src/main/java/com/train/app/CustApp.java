package com.train.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.train.dao.JPAUtility;
import com.train.entities.Customer;

public class CustApp {	
	public static void main(String[] args) {
		EntityManager em =JPAUtility.getEntityManager();		
		List<String> lst = Arrays.asList("9956310","8825463");
		Customer c = new Customer("Ram",lst);

		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(c);
		tr.commit();
		
		JPAUtility.close();
	}
}

