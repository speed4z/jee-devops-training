package com.junitprac;

import java.util.ArrayList;
import java.util.List;

public class Dog {
	int id;
	String breed;
	int age;
	double weight;
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Constructor
	public Dog() {}
	
	public Dog(int id, String breed, int age, double weight) {
		super();
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
	
	//toString
	@Override
	public String toString() {
		return "Dog [id=" + id + ", breed=" + breed + ", age=" + age + ", weight=" + weight + "]";
	}
}
