package com.mockito.entities;

public class Product {
    
    private int id;
    private String brand;
    private int qtyInHand;
    private double price;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getQtyInHand() {
        return qtyInHand;
    }
    public void setQtyInHand(int qtyInHand) {
        this.qtyInHand = qtyInHand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Product(int id, String brand, int qtyInHand, double price) {
        super();
        this.id = id;
        this.brand = brand;
        this.qtyInHand = qtyInHand;
        this.price = price;
    }
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", brand=" + brand + ", qtyInHand=" + qtyInHand + ", price=" + price + "]";
    }

}