package com.jpa.dao;

import java.util.List;

import com.jpa.entities.Author;

public interface AuthorDAO {
	Author addAuthor(Author a);
	Author deleteAuthor(int id) throws IDNotFoundException;
	Author updateAuthor(Author a) throws IDNotFoundException;
	List<Author> listAllAuthor();
	Author listById(int id) throws IDNotFoundException;
}
