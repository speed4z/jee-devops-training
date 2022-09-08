package com.training.day4;

import java.util.*;

public class ArrayPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []arr = {1,2,3,4,5,6};
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println("---------------------------------------");
		
		int [][]twoD = new int[3][3];
		System.out.println("Enter elements in 3x3 array");
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				twoD[i][j] = sc.nextInt();
			}
		}
		for(int []ar:twoD) {
			for(int e:ar) {
				System.out.print(e+"  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		Account []accArr = new Account[5];
		for(int k =0;k<accArr.length;k++) {
			accArr[k]=createAcc();
		}
		for(int k =0;k<accArr.length;k++) {
			System.out.println(accArr[k]);
		}
				
	sc.close();
	}
	
	public static Account createAcc() {
		Scanner sc = new Scanner(System.in);
		String name;
		String branch;
		int balance;
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter balance:");
		balance = sc.nextInt();
		System.out.println("Enter branch:");
		branch = sc.nextLine();
		Account acc = new Account(name,balance,branch);
		return acc;
	}
}
