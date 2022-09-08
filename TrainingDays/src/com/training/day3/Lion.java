package com.training.day3;

public class Lion extends Animal{

	@Override
	public void register() {
		System.out.println("Lion Registration completed.");
	}

	@Override
	public void eat() {
		System.out.println("Lion Eats");
	}

	@Override
	public void sleep() {
		System.out.println("Lion Sleeps");
	}

	@Override
	public void play() {
		System.out.println("Lion Plays");
	}	
	
	public void hunt() {
		System.out.println("Lion Hunts");
	}

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(int id, String color, double height, double weight) {
		super(id, color, height, weight);
		// TODO Auto-generated constructor stub
	}

	public Lion(int id, String color, double height) {
		super(id, color, height);
		// TODO Auto-generated constructor stub
	}

	public Lion(int id, String color) {
		super(id, color);
		// TODO Auto-generated constructor stub
	}

	public Lion(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
