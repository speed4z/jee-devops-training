package com.lab14.lambdas;

import java.util.Scanner;

@FunctionalInterface
interface Space{
	String insertSpace(String str);
}

public class App2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Space s = (String str)->{String newStr="";
			for(int i=0;i<str.length();i++) {
				newStr+=str.charAt(i);
				newStr+=" ";						
			}
			return newStr;};
			
			System.out.println("Enter String");
			String s1 = sc.next();
			System.out.println(s.insertSpace(s1));
		
	}
}
