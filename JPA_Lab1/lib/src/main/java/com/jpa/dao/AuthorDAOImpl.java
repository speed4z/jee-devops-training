package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jpa.entities.Author;

public class AuthorDAOImpl implements AuthorDAO {
	
	EntityManager em = JPAUtility.getEntityManager();

	@Override
	public Author addAuthor(Author a) {
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(a);
		tr.commit();
		return a;
	}

	@Override
	public Author deleteAuthor(int id) throws IDNotFoundException {
		EntityTransaction tr = em.getTransaction();
		Author a1 = em.find(Author.class,id);
		if(a1==null) {
			throw new IDNotFoundException("Author with this ID not found!");
		}
		else {
			tr.begin();
			em.remove(a1);
			tr.commit();
		}
		return a1;		
	}

	@Override
	public Author updateAuthor(Author a1) throws IDNotFoundException {
		EntityTransaction tr = em.getTransaction();
		Author a2 = em.find(Author.class,a1.getAuthorId());
		if(a2==null) {
			throw new IDNotFoundException("Author with this ID not found!");
					}
		else {
			tr.begin();
			a2.setFirstName(a1.getFirstName());
			a2.setLastName(a1.getLastName());
			a2.setMiddleName(a1.getMiddleName());
			a2.setPhoneNo(a1.getPhoneNo());
			tr.commit();
		}
		return a2;	
	}

	@Override
	public List<Author> listAllAuthor() {
		Query query =  em.createQuery("from Author a");				
		List<Author> lst = query.getResultList();
		return lst;
	}

	@Override
	public Author listById(int id) throws IDNotFoundException {
		EntityTransaction tr = em.getTransaction();
		Author a3 = em.find(Author.class,id);
		if(a3==null) {
			throw new IDNotFoundException("Author with this ID not found!");
					}
		return a3;
	}

}
