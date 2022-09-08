package com.training.day4;

public class Account {
	String accHolder;
	String branch;
	int balance;
	
	
	//Constructors
	public Account() {}
	
	public Account(String accHolder,int balance,String branch) {
		super();
		this.accHolder = accHolder;
		this.balance = balance;
		this.branch = branch;
	}
	
	//Getters n Setters
	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	//toString 
	@Override
	public String toString() {
		return "Account [ accHolder=" + accHolder + ", balance=" + balance + "]";
	}
}
