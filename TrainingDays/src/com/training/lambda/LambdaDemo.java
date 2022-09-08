package com.training.lambda;


class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<100; i+=10) {
			System.out.println(i);
			try {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			finally {
				
			}
		}
	}
}

public class LambdaDemo {
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.start();	
		
//		Runnable r1 = new Runnable () { 
//			@Override
//			public void run() {
//				System.out.println("Anonymous runnable!");
//			}
//		};
//		
//		Thread t2 = new Thread(r1);
//		t2.start();	
		
		//Using above runnable anonymous impl using lambda
		
		Runnable r1 =  ()->{
			for(int i = 4; i<90; i+=10) {
				System.out.println(i+" Anonymous impl"); 
				try {
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				finally {
					
				}
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();	
	}
}
