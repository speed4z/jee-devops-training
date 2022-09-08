package com.training.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	@Id
	@GeneratedValue
	private long id;
	private LocalDate dateOfSale;
	@OneToOne
	private Customer customer;
	@OneToMany
	private List<Product> products;
	
	//Constructors
	public Order() {}	
	
	public Order(LocalDate dateOfSale, Customer customer, List<Product> products) {
		super();
		this.dateOfSale = dateOfSale;
		this.customer = customer;
		this.products = products;
	}
	
	//Get Set
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDateOfSale() {
		return dateOfSale;
	}
	public void setDateOfSale(LocalDate dateOfSale) {
		this.dateOfSale = dateOfSale;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	//toString		
	@Override
	public String toString() {
		return "Order [id=" + id + ", dateOfSale=" + dateOfSale + ", customer=" + customer + ", products=" + products
				+ "]";
	}
}
