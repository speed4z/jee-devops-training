package com.training.entities;

public class Vendor {
  private int id;
  private String name;
  
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
public Vendor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Vendor [id=" + id + ", name=" + name + "]";
}

//method name can be decided by you	
public void init() {
	   System.out.println("Vendor bean initialised ");
}

public void destroy() {
	  
	  System.out.println("Vendor bean destroyed");
}
  
}