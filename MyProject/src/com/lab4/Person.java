package com.lab4;

public class Person {
	String name;
	float age;
	
	//Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}	
	
	//Constructors
	public Person() {}
	
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return " name: "+this.name;
	}	
	
	
	
}
