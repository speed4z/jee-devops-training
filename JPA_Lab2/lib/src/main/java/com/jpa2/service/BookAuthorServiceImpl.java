package com.jpa2.service;

import java.util.List;

import com.jpa2.dao.BookAuthorDAO;
import com.jpa2.dao.BookAuthorDAOImpl;
import com.jpa2.dao.IDNotFoundException;
import com.jpa2.entities.Author;
import com.jpa2.entities.Book;

public class BookAuthorServiceImpl implements BookAuthorService{
	private BookAuthorDAO dao = new BookAuthorDAOImpl();

	@Override
	public Book createBook(Book b) {
		// TODO Auto-generated method stub
		return dao.createBook(b);
	}
	
	@Override
	public List<Book> allBooks() {
		// TODO Auto-generated method stub
		return dao.allBooks();
	}

	@Override
	public List<Book> allBooksByAuthor(String a) {
		// TODO Auto-generated method stub
		return dao.allBooksByAuthor(a);
	}

	@Override
	public List<Book> booksWithinPrice(double a, double b) {
		// TODO Auto-generated method stub
		return dao.booksWithinPrice(a, b);
	}

	@Override
	public String authorNameForId(long id) throws IDNotFoundException {
		// TODO Auto-generated method stub
		return dao.authorNameForId(id);
	}

}
