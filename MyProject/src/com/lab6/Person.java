package com.lab6;

public class Person {

	String first_name;
	String last_name;
	int age;
	
	//Getters and Setters
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Constructors
	public Person(String first_name, String last_name, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	public Person(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + "]";
	}
	
}
