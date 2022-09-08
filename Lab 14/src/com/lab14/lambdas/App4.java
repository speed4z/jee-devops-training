package com.lab14.lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@FunctionalInterface
interface MyFunc{
	Person getRef(String name,int age,LocalDate dob);
}
public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=createList();
		System.out.println("Person List");
		  list.forEach(System.out::println);
		
		  System.out.println("");
		System.out.println("Sorting the list by age");
	    List<Person> sortList=list.stream()
	    		.sorted(Comparator.comparingInt(Person::getAge))
	    		.collect(Collectors.toList());
	    
	    sortList.forEach(System.out::println);
	    System.out.println("");
	    System.out.println("Sorting the list by name");

	    List<Person> sortList2=list.stream()
	    		.sorted(Comparator.comparing(Person::getName))
	    		.collect(Collectors.toList());
	    
	    sortList.forEach(System.out::println);
	    
	    System.out.println("");
	    System.out.println("Sorting the list by date of birth");

	    list.sort((p1,p2)->p1.getDob().compareTo(p2.getDob()));	    
	    list.forEach(System.out::println);
	}

	private static List<Person> createList() {
		// TODO Auto-generated method stub
		List<Person> ex=new ArrayList<Person>();
		MyFunc mf=Person::new;
		Person person = mf.getRef("Sam",22,LocalDate.of(2000, 06, 22));
		ex.add(person);
		person = mf.getRef("John",21,LocalDate.of(1999, 05, 12));
		ex.add(person);
		person = mf.getRef("Max",22,LocalDate.of(2001, 02, 20));
		ex.add(person);
		person = mf.getRef("Hamilton",20,LocalDate.of(2000, 06, 02));
		ex.add(person);
		person = mf.getRef("Sainz",19,LocalDate.of(1999, 01, 28));
		ex.add(person);
		return ex;
	}

}
