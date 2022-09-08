package com.lab7;


import java.util.ArrayList;
import java.util.Collections;

public class StringArrayList {
	public static void main(String[] args) {
		
		String[] myArray = {"Shoes", "Shirt", "Apples","Laptops", "Books", "Pen"};
		ArrayList<String> s=new ArrayList<String>();
		Collections.addAll(s,myArray);
		Collections.sort(s);
		for(String i:s)
		{
			System.out.println(i);
		}
	}
}
