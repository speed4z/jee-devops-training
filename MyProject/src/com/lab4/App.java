package com.lab4;

public class App {
	public static void main(String[] args) {
		
		Person smith = new Person();
		smith.setName("Smith");		
		Person kathy = new Person();
		kathy.setName("Kathy");
		
		Account a1 = new Account();
		a1.setAccHolder(smith);
		a1.setBalance(2000);
		System.out.println(a1);
		
		Account a2 = new Account();
		a2.setAccHolder(kathy);
		a2.setBalance(3000);
		System.out.println(a2);
		
		a1.deposit(2000);
		System.out.println("Balance in Smith Account:"+a1.getBalance());
		
		a2.withdraw(2000);
		System.out.println("Balance in Kathy Account:"+a2.getBalance());
		
		System.out.println("------------------------------------------------------------------");		
		Account s1 = new SavingAccount();
		s1.setAccHolder(smith);
		s1.setBalance(3000);		
		System.out.println(s1);
		s1.withdraw(1000);
		s1.withdraw(1900);
		System.out.println(s1);
		
		System.out.println("------------------------------------------------------------------");
		
		Account c1 = new CurrentAccount();
		c1.setAccHolder(kathy);
		c1.setBalance(2000);		
		System.out.println(c1);		
		c1.withdraw(1000);
		c1.withdraw(1100);
		System.out.println(c1);
		c1.withdraw(500);
		c1.deposit(1000);
		System.out.println(c1);		
	}
}
