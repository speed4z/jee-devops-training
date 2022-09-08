package com.lab2;

public class Person {
//	Person Details:
//		____________
//	First Name: Divya
//	Last Name: Bharathi
//	Gender: F
//	Age: 20
//	Weight: 85.55
	String first_name;
	String last_name;
	Gender gender;
	int age;
	double weight;
	String mobile_number;
	
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
	
public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	//Constructors
	public Person() {}
	
	public Person(String first_name, String last_name,Gender  gender, int age, double weight) {		
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	//toString Method
	@Override
	public String toString() {
		return "Person Details:\n____________\n"
				+ "First Name: " + first_name + "\nLast Name: " + last_name + "\nGender: " + gender + "\nAge: " + age
				+ "\nWeight: " + weight;
	}
	
	public String personalDetails() {
		return (toString() + "\nMobile Number: "+mobile_number);
	}

}
