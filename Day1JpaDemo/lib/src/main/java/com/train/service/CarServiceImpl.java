package com.train.service;

import com.train.dao.CarDAO;
import com.train.dao.CarDAOImpl;
import com.train.entities.Car;

public class CarServiceImpl implements CarService{
	private CarDAO dao = new CarDAOImpl();
	@Override
	public Car addCar(Car c) {
		return dao.addCar(c);
	}
}
