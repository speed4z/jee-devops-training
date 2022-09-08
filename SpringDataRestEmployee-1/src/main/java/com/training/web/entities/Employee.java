package com.training.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rest_empl")
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	private String city;
	private String department;
	
	//Constructors
	public Employee() {}

	public Employee(String name, String email, String city, String department) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.department = department;
	}
	
	public Employee(Long id, String name, String email, String city, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.department = department;
	}
	//get set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", department="
				+ department + "]";
	}
	
	
}
