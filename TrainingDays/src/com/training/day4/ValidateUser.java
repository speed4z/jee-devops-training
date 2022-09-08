package com.training.day4;

import java.util.regex.*;

public class ValidateUser extends User{
	
	public void validateUserName(String userName) throws UsernameException{
		if (Pattern.matches("[A-Za-z]*", userName)==false) {
			throw new UsernameException("Username is Invalid!");
		}
	}
	
	public void validatePassword(String password) throws PasswordException{
		if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&]).{8,20}$", password)==false) {
			throw new PasswordException("Password is Invalid!");
		}
	}
	
	public User createUser(String name,String password) {
		User a;
		try {
			validateUserName(name);
			validatePassword(password);
			
			a = new User();
			a.setUserName(name);
			a.setPassword(password);
		}
		
		catch(UsernameException u) {
			System.out.println(u);
			return null;
		}
		catch(PasswordException p) {
			System.out.println(p);	
			return null;
		}	
		return a;		
	}
}
