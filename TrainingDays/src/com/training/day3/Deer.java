package com.training.day3;

public class Deer extends Animal{
	

	@Override
	public void register() {
		System.out.println("Deer Registration completed.");
	}
	
	@Override
	public void eat() {
		System.out.println("Deer Eats");
	}

	@Override
	public void sleep() {
		System.out.println("Deer Sleeps");
	}

	@Override
	public void play() {
		System.out.println("Deer Plays");
	}
	
	public void runs() {
		System.out.println("Deer Runs");
	}

	public Deer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deer(int id, String color, double height, double weight) {
		super(id, color, height, weight);
		// TODO Auto-generated constructor stub
	}

	public Deer(int id, String color, double height) {
		super(id, color, height);
		// TODO Auto-generated constructor stub
	}

	public Deer(int id, String color) {
		super(id, color);
		// TODO Auto-generated constructor stub
	}

	public Deer(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

}
