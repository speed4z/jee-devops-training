package com.training.entities;

import java.util.Map;

public class Student {
	private int id;
	private String name;
	private Map<String,String> courses;
	
	public Student() {}
	
	public Student(String name, Map<String, String> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	public Student(int id, String name, Map<String, String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	//method name can be decided by you	
	  public void init() {
		   System.out.println("Student bean initialised ");
	  }
	  
	  public void destroy() {
		  
		  System.out.println("Student bean destroyed");
	  }
	
}
