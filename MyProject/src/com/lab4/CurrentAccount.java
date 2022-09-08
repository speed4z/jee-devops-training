package com.lab4;

public class CurrentAccount extends Account{
	double overdraftLimit = 500;

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<= this.balance+overdraftLimit) {
			balance -= amount;
		}
		else {
			System.out.println("Can not withdraw!");
		}
	}
	
	//Setters and Getters
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}		
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	//Constructors
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
		
}
