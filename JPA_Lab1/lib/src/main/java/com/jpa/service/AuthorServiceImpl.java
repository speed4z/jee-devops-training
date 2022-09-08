package com.jpa.service;

import java.util.List;

import com.jpa.dao.AuthorDAO;
import com.jpa.dao.AuthorDAOImpl;
import com.jpa.dao.IDNotFoundException;
import com.jpa.entities.Author;

public class AuthorServiceImpl implements AuthorService{
	private AuthorDAO dao = new AuthorDAOImpl();

	@Override
	public Author addAuthor(Author a) {
		return dao.addAuthor(a);
	}

	@Override
	public Author deleteAuthor(int id) throws IDNotFoundException {
		return dao.deleteAuthor(id);
	}

	@Override
	public Author updateAuthor(Author a) throws IDNotFoundException {
		return dao.updateAuthor(a);
	}

	@Override
	public List<Author> listAllAuthor() {
		return dao.listAllAuthor();
	}

	@Override
	public Author listById(int id) throws IDNotFoundException {
		return dao.listById(id);
	}

}
