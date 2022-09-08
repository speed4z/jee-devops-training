package com.junitprac;

import java.util.ArrayList;
import java.util.List;

public class DogService {

	List <Dog> list = new ArrayList<>();
	
	public List filterDogByAge(List <Dog>l,int age) {
			List <Dog> filterAgeDogList = new ArrayList<>();
			for (Dog d: l) {
				if(d.getAge()==age) {
					filterAgeDogList.add(d);
				}
			}		
			return filterAgeDogList;
	}
	

	
	public List filterDogByWeight(List<Dog> l,double weight) {
		List <Dog> filterWeightDogList = new ArrayList<>();
		for (Dog d: l) {
			if(d.getWeight()==weight) {
				filterWeightDogList.add(d);
			}
		}		
		return filterWeightDogList;
}

//	public List filterDogByAge(List <Dog>l,int age) {
//	return null;
//}	
//	
//	public List filterDogByWeight(List<Dog> l,double weight) {
//		return null;
//	}
	
}
