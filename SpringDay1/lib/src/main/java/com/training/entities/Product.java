package com.training.entities;

public class Product {
private Vendor vendor;
private int id;
private String name;

public static Product getProduct() {
	return new Product();
}
public Vendor getVendor() {
	return vendor;
}
public void setVendor(Vendor vendor) {
	this.vendor = vendor;
}
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
@Override
public String toString() {
	return "Product [vendor=" + vendor + ", id=" + id + ", name=" + name + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(Vendor vendor, int id, String name) {
	super();
	this.vendor = vendor;
	this.id = id;
	this.name = name;
}

//method name can be decided by you	
public void init() {
	   System.out.println("Product bean initialised ");
}

public void destroy() {
	  
	  System.out.println("Product bean destroyed");
}

}