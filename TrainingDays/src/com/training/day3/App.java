package com.training.day3;

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
				a1 = null;
				System.out.println("Invalid choice");
				System.exit(0);
		}
		
		meetMyFriend(a1);
		
		sc.close();
	}	
	
	public static void meetMyFriend(Animal a) {
		
		if(a instanceof Deer) {
			((Deer) a).eat();
			((Deer) a).sleep();
			((Deer) a).play();
			((Deer) a).runs();
			((Deer) a).register();
			
		}
		else if(a instanceof Lion) {
			((Lion) a).eat();
			((Lion) a).sleep();
			((Lion) a).play();
			((Lion) a).hunt();
			((Lion) a).register();
		}		
		else if(a instanceof Elephant) {
			((Elephant) a).eat();
			((Elephant) a).sleep();
			((Elephant) a).play();
			((Elephant)a).goingToRiver();
			((Elephant) a).register();
		}
		else {
			System.out.println("Invalid object");
		}
	}
}
