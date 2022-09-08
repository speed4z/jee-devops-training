package com.mockito.app;


import java.util.Scanner;

import com.mockito.entities.Product;
import com.mockito.exception.ProductNotFoundException;
import com.mockito.services.ProductService;
import com.mockito.services.ProductServiceImpl;


public class ProductCRUD {
	//client code has  a service object
	private static ProductService service = new ProductServiceImpl();
	
	public static void main(String[] args) {
		System.out.println("1.Add a product");
		System.out.println("2.update a product");
		System.out.println("3.delete a product");
		System.out.println("4.List a product");
		System.out.println("5.List all products");
		System.out.println("Enter choice");
		int choice = new Scanner(System.in).nextInt();
		
		switch (choice) {
		
		
		case 1:Product p = acceptDetails();
		      p=service.addProduct(p);
		      System.out.println("added "+p);
		      break;
		case 2:
			break;
		case 3:System.out.println("Enter product id ");
		int idd = new Scanner(System.in).nextInt();
		
			try {
				Product p2 = service.deleteProduct(idd);
			} catch (ProductNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());;
			}
		     
			break;
		case 4:
			System.out.println("Enter product id ");
			int id = new Scanner(System.in).nextInt();
			try {
				System.out.println(service.listProductById(id));
			} catch (ProductNotFoundException e) {
				// TODO Auto-generated catch block
			 System.out.println(e.getMessage());
			}
			break;
		case 5:System.out.println(service.listAllProducts());
			break;
		default:
			System.out.println("Invalid option");
			System.exit(0);
			
		}
		
	}
		private static Product acceptDetails() {
			
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter id");
		int id =  scanner.nextInt();
		System.out.println("Enter brand");
		String brand = scanner.next();
		System.out.println("Enter price");
		double price =  scanner.nextDouble();
		System.out.println("Enter quantity in hand");
        int qtyInHand =  scanner.nextInt();
        
        Product p= new Product(id,brand,qtyInHand,price);
        return p;
			
		}
		
		
		
	
}