package com.training.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
		Set <Product> prodSet = new TreeSet<>();
		
		Product p1 = new Product(1, "type 2","puma",5, 1000.00);
		Product p2 = new Product(2, "type 1","nike",6, 1050.00);
		Product p3 = new Product(3, "type 0","amazon",3, 3000.00);
		Product p4 = new Product(4, "type 4","LG",21, 700.00);
		Product p5 = new Product(5, "type 3","Samsung",13, 2700.00);
		
		prodSet.add(p1);
		prodSet.add(p2);
		prodSet.add(p3);
		prodSet.add(p4);
		prodSet.add(p5);
		
		System.out.println("==========default Sort by ID==========");
		for(Product p: prodSet) {
			System.out.println(p);
		}		
		
		Set <Product> set2 = new TreeSet<>(new DescriptionComparator());
		set2.addAll(prodSet);
		System.out.println();
		System.out.println("========== Description Comparator ==========");		
		for(Product p: set2) {
			System.out.println(p);
		}		
		
		Set <Product> set3 = new TreeSet<>(new PriceComparator());
		set3.addAll(prodSet);
		System.out.println();
		System.out.println("========== Price Comparator ==========");		
		for(Product p: set3) {
			System.out.println(p);
		}		
	}
}
