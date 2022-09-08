package com.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_trainee")

public class Trainee {
	@Id
	@GeneratedValue
	private int Id;
	
	private String Name;
	private String Domain;
	private String Location;
	
	
	//constructors
	public Trainee() {
		super();
	}	
	
	public Trainee(String name, String domain, String location) {
		super();
		Name = name;
		Domain = domain;
		Location = location;
	}

	public Trainee(int id, String name, String domain, String location) {
		super();
		Id = id;
		Name = name;
		Domain = domain;
		Location = location;
	}
	
	//get set	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	//toString
	@Override
	public String toString() {
		return "Trainee [Id=" + Id + ", Name=" + Name + ", Domain=" + Domain + ", Location=" + Location + "]";
	}
	
}
