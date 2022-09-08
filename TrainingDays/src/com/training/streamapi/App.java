package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Ram",22,"CS");
		Student s2= new Student(2,"Sam",21,"Maths");
		Student s3 = new Student(3,"John",19,"Maths");
		Student s4 = new Student(4,"Rohan",20,"CS");
		Student s5 = new Student(5,"Atharva",22,"Maths");
		Student s6 = new Student(6,"Sam",20,"Physics");
		Student s7 = new Student(7,"Pratik",21,"Physics");
		
		List<Student> student = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		
		Map<String, List<Integer>> map = student.stream()
				.collect(Collectors.groupingBy(Student::getDepartment,
						Collectors.mapping(Student::getId, Collectors.toList())));
		
		
		Map<String, List<Integer>> map2 = student.stream()
				.collect(Collectors.groupingBy(Student::getName,
						Collectors.mapping(Student::getId, Collectors.toList())));
		
		System.out.println(map);		
		System.out.println();
		System.out.println(map2);	
		
	}
}