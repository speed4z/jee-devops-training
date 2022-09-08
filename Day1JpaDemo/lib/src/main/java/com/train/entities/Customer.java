package com.train.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@GeneratedValue
	int id;
	String name;
	@ElementCollection
	List<String> phoneNumbers ;
	
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
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = (ArrayList<String>) phoneNumbers;
	}
	
	//Constructors
	public Customer() {}
	
	public Customer(String name, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = (List<String>) phoneNumbers;
	}
	
	public Customer(int id, String name, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = (List<String>) phoneNumbers;
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
}
