package com.prac;

import java.util.Scanner;

class InvalidBankException extends Exception{

	public InvalidBankException() {
		super();
	}

	public InvalidBankException(String message) {
		super(message);
	}
	
}

class Bank{	
	
	private Integer accno;
	private String name;
	private Double balance;
	
	public Bank() {}
	
	public Bank(Integer accno, String name, Double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	static void validate(Bank b) throws InvalidBankException{
		if(b.getBalance()<1000) {
			throw new InvalidBankException("Balance is less than 1000");
		}
		else {
			System.out.println(b.getAccno()+" "+b.getName()+" "+b.getBalance());
		}
	}	
}

public class Main{
	public static void main(String[] args) throws InvalidBankException {	
		Scanner sc = new Scanner(System.in);
		Integer accno = sc.nextInt();
		String name = sc.next();
		Double bal = sc.nextDouble();		
		Bank b1 = new Bank(accno,name,bal);
		try {
			Bank.validate(b1);
		}
		catch (InvalidBankException i) {
			System.out.println(i.getMessage());
			System.out.println("InvalidBalanceException");
		}
	}
}
