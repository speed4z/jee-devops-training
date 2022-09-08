package com.training.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.TreeSet;

public class Batch {
	private static long c=1;
	static Map <Long,Student> map =  new HashMap<>();
	
	public static void validateName(Student s) throws NameException{
		if(s.getName()=="" |Pattern.matches("\\d",s.getName())) {
			throw new NameException("Name not valid!");
		}
	}	
	public static void validateScore(Student s) throws ScoreException{
		if(s.getScore() > 100) {
			throw new ScoreException("Score not valid!");
		}
	}
	public static void addStudent(Student s) {
		try {
			validateName(s);
			validateScore(s);
			map.put(c++,s);
			System.out.println("Student added in batch!");
		}
		catch (NameException n) {
			System.out.println(n);
			System.out.println("Not able to add");
		}
		catch (ScoreException se) {
			System.out.println(se);
			System.out.println("Not able to add");
		}
		catch(Exception e) {
			System.out.println("Not able to add");
		}
	}
	public static void displayKeys() {
		for (long l: map.keySet()) {
			System.out.println(l+"\t");
		}
	}
	public static void displayValues() {
		for (Student s: map.values()) {
			System.out.println(s+"\t");
		}
	}
	public static void displayEntrySet() {
		for (Entry<Long, Student>set : map.entrySet()) {
			System.out.print(set.getKey()+":\t");
			System.out.println(set.getValue());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Ram",90);
		Student s2 = new Student(2,"Sam",80);
		Student s3 = new Student(3,"Nick",100);
		Student s4 = new Student(4,"Harsh",175);
		
		addStudent(s1);
		addStudent(s2);
		addStudent(s3);
		addStudent(s4);
		
		displayEntrySet();
		displayValues();
		displayKeys();

	}
}
