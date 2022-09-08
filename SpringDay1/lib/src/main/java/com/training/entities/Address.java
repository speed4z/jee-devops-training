package com.training.entities;

public class Address {
	private String flatNumber;
	private String bldgName;
	private String streetname;
	private String city;
	
	
	public Address() {}
	
	public Address(String flatNumber, String bldgName, String streetname, String city) {
		super();
		this.flatNumber = flatNumber;
		this.bldgName = bldgName;
		this.streetname = streetname;
		this.city = city;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getBldgName() {
		return bldgName;
	}
	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", bldgName=" + bldgName + ", streetname=" + streetname + ", city="
				+ city + "]";
	}
	

	//method name can be decided by you	
	public void init() {
		   System.out.println("Address bean initialised ");
	}

	public void destroy() {
		  
		  System.out.println("Address bean destroyed");
	}
	
}
