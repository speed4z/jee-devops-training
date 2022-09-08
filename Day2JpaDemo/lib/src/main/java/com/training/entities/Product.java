package com.training.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue
	private long prodId;
	private String pName;
	private double price;
	
	//Constructor
	public Product() {}
	
	public Product(String pName, double price) {
		super();
		this.pName = pName;
		this.price = price;
	}
	
	public Product(long prodId, String pName, double price) {
		super();
		this.prodId = prodId;
		this.pName = pName;
		this.price = price;
	}

	public long getId() {
		return prodId;
	}

	public void setId(long prodId) {
		this.prodId = prodId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
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
		return "Product [prodId=" + prodId + ", pName=" + pName + ", price=" + price + "]";
	}
}
