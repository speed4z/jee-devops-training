package com.training.day3;

public abstract class Animal implements Registration{
	int id;
	String color ;
	double height ;
	double weight ;	

	public  void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
	
	public void play() {
		System.out.println("Play");
	}
	
	//Setters and Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Constructors
	public Animal() {}

	public Animal(int id) {
		super();
		this.id = id;
	}

	public Animal(int id, String color) {
		super();
		this.id = id;
		this.color = color;
	}

	public Animal(int id, String color, double height) {
		super();
		this.id = id;
		this.color = color;
		this.height = height;
	}
	
	public Animal(int id, String color, double height, double weight) {
		super();
		this.id = id;
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
}