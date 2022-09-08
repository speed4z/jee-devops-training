package com.junitprac;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.*;

class DogSpecs {	
	static List<Dog> list;
	static DogService service;
	
	@BeforeAll
	public static void setupBeforeAll() {
		
		Dog d1 = new Dog(1,"German Sheepherd",8,15);
		Dog d2 = new Dog(2,"Golden Retriever",5,16);
		Dog d3 = new Dog(3,"Doberman",10,20);
		Dog d4 = new Dog(4,"Chihuahua",8,16);
		
		service = new DogService();
		list =  Arrays.asList(d1,d2,d3,d4);
	}	
	
	
	@Test
	void testFilterByAge() {
		assertEquals("[Dog [id=2, breed=Golden Retriever, age=5, weight=16.0]]" 
				,service.filterDogByAge(list, 5).toString()   );
	}
	@Test
	void testFilterByWeight() {
		assertEquals(  "[Dog [id=1, breed=German Sheepherd, age=8, weight=15.0]]" 
				,service.filterDogByWeight(list, 15).toString() );
	}

}
