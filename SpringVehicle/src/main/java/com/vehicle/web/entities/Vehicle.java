package com.vehicle.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_vehicle")
public class Vehicle {

	@Id
	@GeneratedValue
	private Long id;
	private String model;
	private long registeredNumber;
	
	//get set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getRegisteredNumber() {
		return registeredNumber;
	}
	public void setRegisteredNumber(long registeredNumber) {
		this.registeredNumber = registeredNumber;
	}
	//constructors
	public Vehicle() {
		super();
	}
	public Vehicle(Long id, String model, long registeredNumber) {
		super();
		this.id = id;
		this.model = model;
		this.registeredNumber = registeredNumber;
	}
	public Vehicle(String model, long registeredNumber) {
		super();
		this.model = model;
		this.registeredNumber = registeredNumber;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", registeredNumber=" + registeredNumber + "]";
	}
}