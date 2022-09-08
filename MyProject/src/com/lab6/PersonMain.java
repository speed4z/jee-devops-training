package com.lab6;

public class PersonMain {
	
	public static void main(String[] args) {
		ValidateName validate = new ValidateName();
		validate.createPerson("Harsh", "Singh", 16);
		System.out.println("------------------------------------");
		validate.createPerson("sam", "", 16);
		}
}
