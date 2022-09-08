package com.training.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		
		IntStream.range(1,11).mapToObj(a->"Data "+a).forEach(System.out::println);
		
		System.out.println("----------");
		
		//Working of Stream is Vertical
		//First object will pass through all the functions
		//then second object ....... then last.
		//Here "a1" will pass through map,mapToInt,max (max here is terminating function)
		//Then "a2" and then "a3"
		//At end max gives 3 . if present it will be printed.
		
		//intermediate ops have characteristics of laziness.
		//Unless terminating function is present; intermediate operations won't proceed.
		//
		
		Stream.of("a1","a2","a3")
		.map(a->a.substring(1))
		.mapToInt(Integer::parseInt)		
		.max()
		.ifPresent(System.out::println);
	
		System.out.println("----------");
		
		Stream.of(1.0,3.5,5.6)
		.mapToInt(Double::intValue)
		.mapToObj(val->"New Data "+val)
		.forEach(System.out::println);
		
		System.out.println("----------");
		
	}
}
