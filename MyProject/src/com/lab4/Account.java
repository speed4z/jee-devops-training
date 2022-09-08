package com.lab4;

public class Account {
	static long accNum= 1001;
	double balance;
	Person accHolder;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(this.balance>= amount) {
			balance -= amount;
		}		
		else {
			System.out.println("Can not withdraw!");
		}
	}
	public double getBalance() {
		return this.balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Constructors
	public Account() {
		++accNum;
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		++accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}	
	
	//toString method
	@Override
	public String toString() {
		return "Account [Account Num="+accNum+",balance=" + balance + ", accHolder=" + accHolder + "]";
	}	
	
}
