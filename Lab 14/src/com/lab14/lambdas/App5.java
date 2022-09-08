package com.lab14.lambdas;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface{
	int myFunc(int n);
}

class IntOpertions{
	static int factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result=i*result;
		}
		return result;
	}
}
public class App5 {
 static int fact(MyInterface myInterface, int n) {
	 return myInterface.myFunc(n);
	 
 }
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int num = sc.nextInt();
	 int result=fact(IntOpertions::factorial,num);
	 System.out.println("Factorial is : "+result);
 }
}
