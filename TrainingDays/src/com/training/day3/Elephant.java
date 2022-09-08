package com.training.day3;

public class Elephant extends Animal {

	@Override
	public void register() {
		System.out.println("Elephant Registration completed.");
	}

	@Override
	public void eat() {
		System.out.println("Elephant Eats");
	}

	@Override
	public void sleep() {
		System.out.println("Elephant Sleeps");
	}

	@Override
	public void play() {
		System.out.println("Elephant Plays");
	}
	
	public void goingToRiver() {
		System.out.println("Elephant going to River");
	}

	public Elephant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elephant(int id, String color, double height, double weight) {
		super(id, color, height, weight);
		// TODO Auto-generated constructor stub
	}

	public Elephant(int id, String color, double height) {
		super(id, color, height);
		// TODO Auto-generated constructor stub
	}

	public Elephant(int id, String color) {
		super(id, color);
		// TODO Auto-generated constructor stub
	}

	public Elephant(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

}
