package com.jpa2.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String title;
    private String isbn;
    private double price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author")
    private Author author;
    
    //Constructors
    public Book() {}
    
    public Book(String title, String isbn, double price, Author author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.author = author;
	}
    
	public Book(String title, String isbn, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}

	public Book(Long id, String title, String isbn, double price) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	
	//get set    
    public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", price=" + price + "]";
	}
}