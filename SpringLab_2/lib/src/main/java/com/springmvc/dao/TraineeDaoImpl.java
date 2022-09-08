package com.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.springmvc.entities.Trainee;

public class TraineeDaoImpl implements TraineeDao{

	@Override
	public Trainee addTrainee(Trainee t) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtility.getEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		em.persist(t);
		tr.commit();
		return t;
	}

	@Override
	public Trainee removeTrainee(int id) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtility.getEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		Trainee t1 = em.find(Trainee.class, id);
		if(t1==null) {
			throw new TraineeNotFoundException("Trainee with this id does not exist");
		}else {
			tr.begin();
			em.remove(t1);
			tr.commit();
		}
		return t1;
	}

	@Override
	public Trainee updateTrainee(Trainee t) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtility.getEntityManager();
		EntityTransaction tr = em.getTransaction();
		Trainee t2=em.find(Trainee.class, t.getId());
		if(t2==null) {
			throw new TraineeNotFoundException("Trainee with this id does not exist");
		}else {
			tr.begin();
			t2.setName(t.getName());
			t2.setDomain(t.getDomain());
			t2.setLocation(t.getLocation());
			tr.commit();
		}
		return t2;
	}

	@Override
	public Trainee listById(int id) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtility.getEntityManager();
		Trainee t3 = em.find(Trainee.class, id);
		if(t3==null) {
			throw new TraineeNotFoundException("Trainee with this id does not exist");
		}
		return t3;
	}

	@Override
	public List<Trainee> listAllTrainee() {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtility.getEntityManager();
		Query q = em.createQuery("from trainee t");
		List<Trainee> traineeList = q.getResultList();
		return traineeList;
	}

	@Override
	protected void finalize() throws Throwable {
	super.finalize();
	//closing the entitymanagerfactory 
	JPAUtility.close();
	
	}
}
