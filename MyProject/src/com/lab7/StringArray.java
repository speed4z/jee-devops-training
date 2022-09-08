package com.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringArray {

	public static void main(String[] args) {
		System.out.println("Storing Products!");
		String[] myArray = {"Shoes", "Shirt", "Apples","Laptops", "Books", "Pen"};
		System.out.println(Arrays.toString(myArray));		
		Arrays.sort(myArray);
		System.out.println("After Sortingg:");
		System.out.println(Arrays.toString(myArray));		
	}
}