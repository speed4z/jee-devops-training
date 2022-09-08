package com.training.day5;

import java.util.Objects;

public class Student {
	private long id;
	String name;
	int score;
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//Constructors
	public Student() {}
	
	public Student(long id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	//hash codes and equals	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && score == other.score;
	}
	//toString 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}	
}
