package com.training.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		
		List <String> mylist = Arrays.asList("a1","a2","b1","b2","c1,","c2");
		
		//mylist.stream();
		mylist.stream()
		//Intermediate methods
		.filter((str)->str.contains("c"))
		.map(String::toUpperCase)
		.sorted()
		//Terminating method
		.forEach(System.out::println);
		
		//Same can be written as: 
		System.out.println("-----------");
		mylist.stream()  .map(String::toUpperCase)  .filter((str)->str.contains("B") )	 .sorted().  forEach(System.out::println);
		
	}
}
