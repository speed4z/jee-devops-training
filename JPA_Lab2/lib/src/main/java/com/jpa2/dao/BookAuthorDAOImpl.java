package com.jpa2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jpa2.entities.Author;
import com.jpa2.entities.Book;

public class BookAuthorDAOImpl implements BookAuthorDAO{
	
	EntityManager em = JPAUtility.getEntityManager();

	@Override
	public Book createBook(Book b) {
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(b);
		tr.commit();
		return b;
	}
	
	@Override
	public List<Book> allBooks() {
		Query query = em.createQuery("from Book b");
		List<Book> lst = query.getResultList();
		return lst;
	}

	@Override
	public List<Book> allBooksByAuthor(String a) {		
		String name = a;
		Query q2 = em.createQuery("from Book b where b.author.name=:n");
		//Query q2 = em.createQuery("select a.name from Author a inner join a.book b where b.id = :idd");
		q2.setParameter("n", name);
		List<Book> lst2 = q2.getResultList();
		return lst2;
	}

	@Override
	public List<Book> booksWithinPrice(double a, double b) {
		Query q = em.createQuery("from Book b where b.price between :a and :b");
		q.setParameter("a", a);
		q.setParameter("b", b);
		List<Book> lst = q.getResultList();
		return lst;
	}

	@Override
	public String authorNameForId(long id) throws IDNotFoundException {
		long bookId = id;
		Book b2 = em.find(Book.class, bookId);
		String res= null;
		if(b2==null) {
			throw new IDNotFoundException("Bood ID not found!");
		}		
		Query q = em.createQuery("select a.name from Author a inner join a.book b where b.id = :idd");
		q.setParameter("idd", bookId);
		
//		List <String> lst = q.getResultList();
//		res = lst.get(0);
		res =q.getSingleResult().toString();
		return res;
	}

}
