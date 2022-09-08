package com.jpa2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(mappedBy = "author")
	private Book book;
	
	//Constructors
	public Author() {}
	
	public Author(String name) {
		super();
		this.name = name;
	}	
	
	public Author(String name, Book book) {
		super();
		this.name = name;
		this.book = book;
	}
	
	public Author(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	
	//get set
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	//toString
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
}
