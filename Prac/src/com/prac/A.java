package com.prac;
import java.util.Scanner;

public class A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int count = 0;
		if(a < 0) {
			System.out.println("Invalid Input");
		}
		else {
			while(a >= 500) {
				a-=500;
				count+=1;
			}
			while(a >= 100) {
				a-=100;
				count+=1;
			}
			while(a >= 50) {
				a-=50;
				count+=1;
			}
			while(a >= 10) {
				a-=10;
				count+=1;
			}
			while(a >= 5) {
				a-=5;
				count+=1;
			}
			while(a >= 1) {
				a-=1;
				count+=1;
			}		
			System.out.println(count);		
		}
	}
}
