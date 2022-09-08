package com.lab11.apps;

import java.util.List;
import java.util.Scanner;

import com.lab11.entities.Mobile;
import com.lab11.entities.PurchaseDetails;
import com.lab11.exception.CustomerNameException;
import com.lab11.exception.EmailException;
import com.lab11.exception.MobileIdException;
import com.lab11.exception.PhoneException;
import com.lab11.service.MobilePurchaseServiceImpl;

public class MobilePurchaseMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws PhoneException, EmailException, CustomerNameException, MobileIdException {
		
		MobilePurchaseServiceImpl service= new MobilePurchaseServiceImpl();
		
		System.out.println("Enter choice");
		System.out.println("1. Insert purchase details.");
		System.out.println("2. List all mobiles.");
		System.out.println("3. List mobile by ID:");
		System.out.println("4. List mobile by Price Range.");
		
		int choice = sc.nextInt();
		
		switch(choice)  {
		
		case 1:
			System.out.println("Enter purchase details!");
			PurchaseDetails p1 = service.createPurchaseDetails();
			service.insertPurchaseDetails(p1);
			System.out.println("Purchase details added : "+p1);
			System.out.println("---------------");
			service.updateMobileQuantity(p1.getMobileid());
			System.out.println("---------------");
			break;
			
		case 2:
			List <Mobile> list = service.listAllMobiles();
			System.out.println("All the mobiles are:");
			for(Mobile m : list) {
				System.out.println(m);
			}
			break;
			
		case 3:
			System.out.println("Enter ID to be serached!");
			int id = sc.nextInt();
			Mobile m1 = service.listMobileById(id);
			System.out.println ("Details of the mobile are:");
			System.out.println(m1);
			break;
			
		case 4:
			System.out.println("Enter a price range");
			double d1,d2;
			System.out.println("Start:");
			d1 = sc.nextDouble();
			System.out.println("End:");
			d2 = sc.nextDouble();
			System.out.println("Mobiles between "+d1+" and "+d2+" are:");
			List <Mobile> list2 = service.listByPriceRange(d1,d2);
			for(Mobile m : list2) {
				System.out.println(m);
			}
			break;
		
		default:
			System.out.println("Invalid choice.");
			System.exit(0);
		}
	}
}
