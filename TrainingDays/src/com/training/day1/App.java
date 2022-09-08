package com.training.day1;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee(11,"Sam",5000.0,LocalDate.of(2020, 1, 1));
		
		Employee e2 = new Employee();
		e2.setId(12);
		e2.setDateOfJoining(LocalDate.of(2021, 2, 2));
		e2.setName("John");
		e2.setSalary(6000.0);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
