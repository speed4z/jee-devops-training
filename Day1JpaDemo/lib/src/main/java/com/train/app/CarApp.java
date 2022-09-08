package com.train.app;

import java.awt.Color;
import java.util.*;
import com.train.dao.JPAUtility;
import com.train.entities.Car;
import com.train.service.CarService;
import com.train.service.CarServiceImpl;
import com.train.entities.Colour;

public class CarApp {
	private static CarService service = new CarServiceImpl();	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter car colour: red, black or white:");
		String col = sc.next();
		Car c1 = new Car();
		c1.setColour(Colour.valueOf(col.toUpperCase()));		
		service.addCar(c1);		
		
		JPAUtility.close();
	}

}
