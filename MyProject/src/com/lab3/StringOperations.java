package com.lab3;

import java.util.*;

public class StringOperations {
	
	public static void add(String s) {
		s= s+s;
		System.out.println(s);		
	}
	
	public static void replace(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				temp += "#";
			}
			else {
				temp += s.charAt(i);
			}				
		}
		s = temp;
		System.out.println(s);
		}
	
	public static void duplicate(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(temp.indexOf(s.charAt(i))==-1) {
				temp += s.charAt(i);
			}
		}
		s = temp;
		System.out.println(s);
	}
	
	public static void oddUpper(String s) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				temp += s.toUpperCase().charAt(i);
			}
			else {
				temp += s.charAt(i);
			}
		}
		s = temp;
		System.out.println(s);
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		
		System.out.println("\nEnter your choice operation:\n1.Add the String to itself"
				+"\n2.Replace odd positions with #"
				+ "\n3.Remove duplicate characters in the String"
				+ "\n4. Change odd characters to upper case");	
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			add(s);
			break;
			
		case 2:
			replace(s);
			break;
				
		case 3:
			duplicate(s);
			break;
			
		case 4:
			oddUpper(s);
			break;
			
		default :
			System.out.println("invalid choice!");
			System.exit(0);
		}		
	sc.close();
	}

}
