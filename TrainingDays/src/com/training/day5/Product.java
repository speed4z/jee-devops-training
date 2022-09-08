package com.training.day5;

import java.util.Objects;

public class Product implements Comparable<Product>{
	int id;
	String description;
	String brand;
	int qtyOnHand;
	double price;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, description, id, price, qtyOnHand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(description, other.description) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& qtyOnHand == other.qtyOnHand;
	}
		
	@Override
	public int compareTo(Product o) {
		Product p = (Product) o;
		if(this.id > p.id) {
			return 1;
		}
		else if(this.id < p.id) {
			return -1;
		}
		return 0;
	}	
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(int qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//Constructors
	public Product() {
	}

	public Product(int id, String description, String brand, int qtyOnHand, double price) {	
		this.id = id;
		this.description = description;
		this.brand = brand;
		this.qtyOnHand = qtyOnHand;
		this.price = price;
	}


	//toString
	@Override
	public String toString() {
		return "Product : id=" + id + ", description=" + description +", brand=" + brand + ", qtyOnHand=" + qtyOnHand + ", price=" + price;
	}

}
