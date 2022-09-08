package com.training.multithreading;

public class App extends Thread{

	public static void main(String[] args) {
		int []arr1 = {2,43,25,12,43};
		int []arr2 = {43,12,21,43,7};
		
		ArraySum a1 = new ArraySum(arr1);
		Thread t1 = new Thread(a1);
		t1.setName("Array 1 Sum");
				
		ArraySum a2 = new ArraySum(arr2);
		Thread t2 = new Thread(a2);
		t2.setName("Array 2 Sum");
		
		t1.start();
		t2.start();		
	}
}
