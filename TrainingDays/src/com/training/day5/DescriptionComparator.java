package com.training.day5;

import java.util.Comparator;

public class DescriptionComparator implements Comparator<Product>{

	public int compare(Product p1, Product p2) {
		return p1.getDescription().compareTo(p2.getDescription());
	}

}
