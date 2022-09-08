package com.training.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.training.dao.JPAUtility;
import com.training.entities.Customer;
import com.training.entities.Order;
import com.training.entities.Product;

public class OrderApp {
	private static EntityManager em =JPAUtility.getEntityManager();
	
	public static void main(String[] args) {
		EntityTransaction tr = em.getTransaction();
		
		//customer obj
		Customer c1 = new Customer("Pratik");
		System.out.println(c1);
		//product obj and list
		Product p1 = new Product("Laptop",60000);
		Product p2 = new Product("Mouse",2000);
		List<Product> lstProd = new ArrayList<>();
		lstProd.add(p1);
		lstProd.add(p2);
		System.out.println(lstProd);
		//order obj
		LocalDate dateOfSale = LocalDate.of(2021, 4, 14);	
		Order o1 = new Order(dateOfSale,c1,lstProd);
		System.out.println(o1);
		

		
		//persist in db
		
		tr.begin();
		em.persist(c1);
		em.persist(p1);
		em.persist(p2);
		em.persist(o1);
		tr.commit();
		
		//Calculating Total Price
		List<Product> lst = o1.getProducts();
		double total = 0;
		for(int i=0;i<lst.size();i++) {
			total += lst.get(i).getPrice();
		}
		System.out.println("Total price is : "+total);
		
		em.close();
	}	
}
