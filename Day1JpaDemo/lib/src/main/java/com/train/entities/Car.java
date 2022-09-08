package com.train.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.train.entities.Colour;

@Entity
@Table
public class Car {
	@Id
	@GeneratedValue
	private int carId;
	@Enumerated(EnumType.STRING)
	private Colour colour;

	//get set
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}	
	
	//Constructor
	public Car() {}	

	public Car(Colour colour) {
		super();
		this.colour = colour;
	}
	//toString
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", colour=" + colour + "]";
	}	
}
