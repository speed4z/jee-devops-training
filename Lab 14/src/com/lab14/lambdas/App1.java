package com.lab14.lambdas;

import java.util.Scanner;
import java.util.stream.Stream;

@FunctionalInterface
interface power{
	double powerXtoY(double a,double b);
}

public class App1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter x:");
		double x = sc.nextInt();
		System.out.println("Enter y:");
		double y = sc.nextInt();
		
		power p1 = (double a,double b) -> Math.pow(a,b) ;
		System.out.println(p1.powerXtoY(x, y));
		System.out.println("For x=3 and y=4:");
		System.out.println(p1.powerXtoY(3, 4));
	}
}
