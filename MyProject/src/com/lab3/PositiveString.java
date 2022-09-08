package com.lab3;

import java.util.*;

public class PositiveString {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		
		for(int i =0;i<s.length()-1;i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				System.out.println("String is Negative");
				System.exit(0);
			}				
		}	
		System.out.println("String is Positive");		
		sc.close();
	}
}
