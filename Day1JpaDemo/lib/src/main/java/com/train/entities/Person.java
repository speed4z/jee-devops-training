package com.train.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Mandatory Annotation to
//Manage this Person entity in database:
@Entity
//Table Annotation
@Table(name="Project_Person")

public class Person {	
	//id Annotation is mandatory, as you need to have Primary key.
	@Id	
	//GeneratedValue is not mandatory, but we are using it to create auto generated values
	//for Id field.
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	//Getters and Setters
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
	
	//Constructors
	public Person () {}	

	public Person ( String name) {
		this.name = name;
		}
	
	public Person (int id,String name) {
		this.id = id;
		this.name = name;
		}	
	
	//toString
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}