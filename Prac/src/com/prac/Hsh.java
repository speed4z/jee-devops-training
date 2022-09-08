package com.prac;

import java.util.HashSet;
import java.util.Set;

public class Hsh {
	public static void main(String[] args) {
		Set haseSet = new HashSet<>();
		haseSet.add("1");
		haseSet.add(1);
		haseSet.add("null1");
		haseSet.add(null);
		System.out.println(haseSet);
	}
}
