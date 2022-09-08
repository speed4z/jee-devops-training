package com.train.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.train.entities.Car;

public class CarDAOImpl implements CarDAO{
	
private EntityManager em =JPAUtility.getEntityManager();
	
	@Override
	public Car addCar(Car c) {
		EntityTransaction tr = em.getTransaction();		
		tr.begin();
		em.persist(c);		
		tr.commit();		
		return c;		
	}
}
