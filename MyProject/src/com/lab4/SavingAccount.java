package com.lab4;

public class SavingAccount extends Account{
	final double minimumBalance = 500;	
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(this.balance >= minimumBalance+amount) {
			super.withdraw(amount);
		}
		else {
			System.out.println("Can not withdraw!");
		}
	}	
	
	//Setters and Getters
	public double getMinimumBalance() {
		return minimumBalance;
	}
	
	//constructors
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

}
