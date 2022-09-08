package com.training.day2;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		Animal a1;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your Animal friend:\n1.Deer\n2.Lion\n3.Elephant");
		int choice = sc.nextInt();
		
		switch (choice){
			case 1:
				a1 =  new Deer(1,"orange",100,50);
				break;
				
			case 2:
				a1 =  new Lion(2,"orange",110,70);
				break;
				
			case 3:
				a1 =  new Elephant(3,"gray",170,150);		
				break;
				
			default:
				a1 = new Animal();
				System.out.println("Invalid choice");
				System.exit(0);
		}
		
		meetMyFriend(a1);
		
		sc.close();
	}	
	
	public static void meetMyFriend(Animal a) {
		
		if(a instanceof Deer) {
			((Deer) a).runs();
		}
		else if(a instanceof Lion) {
			((Lion) a).hunt();
		}		
		else if(a instanceof Elephant) {
			((Elephant)a).goingToRiver();
		}
		else {
			System.out.println("Invalid object");
		}
	}
}
