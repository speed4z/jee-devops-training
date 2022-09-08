package com.junitprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
	DogService service = new DogService();
	
	Dog d1 = new Dog(1,"German Sheepherd",8,15);
	Dog d2 = new Dog(2,"Golden Retriever",5,16);
	Dog d3 = new Dog(3,"Doberman",10,20);
	Dog d4 = new Dog(4,"Chihuahua",8,16);
	
	List <Dog> list =  Arrays.asList(d1,d2,d3,d4);
		
	System.out.println(service.filterDogByAge(list, 5));
	System.out.println(service.filterDogByWeight(list,15));
		
	}
	
}
