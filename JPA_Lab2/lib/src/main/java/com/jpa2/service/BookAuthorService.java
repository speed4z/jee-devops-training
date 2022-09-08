package com.jpa2.service;

import java.util.List;

import com.jpa2.dao.IDNotFoundException;
import com.jpa2.entities.Author;
import com.jpa2.entities.Book;

public interface BookAuthorService {
	Book createBook(Book b);
	List<Book> allBooks();
	List<Book> allBooksByAuthor(String a);
	List<Book> booksWithinPrice(double a, double b);
	String  authorNameForId(long id) throws IDNotFoundException;
}
