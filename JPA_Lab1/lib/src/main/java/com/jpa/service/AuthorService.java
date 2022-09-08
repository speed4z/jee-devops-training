package com.jpa.service;

import java.util.List;

import com.jpa.dao.IDNotFoundException;
import com.jpa.entities.Author;

public interface AuthorService {
	Author addAuthor(Author a);
	Author deleteAuthor(int id) throws IDNotFoundException;
	Author updateAuthor(Author a) throws IDNotFoundException;
	List<Author> listAllAuthor();
	Author listById(int id) throws IDNotFoundException;
}
