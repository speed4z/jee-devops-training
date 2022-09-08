package com.lab14.lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Person {
	private String name;
	private int age;
	private LocalDate dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Person(String name, int age, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
	
}