package com.training.multithreading;

import java.util.*;

public class ArraySum implements Runnable{
	Scanner sc = new Scanner(System.in);
	int []arr = new int[5];
	
	//Constructor
	public ArraySum(int []arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		int sum = 0;
		System.out.println("Thread Start : "+Thread.currentThread().getName());
		
		for(int i =0;i < 5;i++) {
			sum = sum+arr[i];
			System.out.println("Sum After "+(i+1)+" iteration :"+sum +" threadname: " +Thread.currentThread().getName());		
			
		}		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
	}
}
