package com.lab6;

public class ValidateName {
	public void validateFirstName(String fName) throws FirstNameException{
		if(fName == "") {
			throw new FirstNameException ("Blank First Name");
		}
	}
	public void validateLastName(String lName) throws LastNameException{
		if(lName == "") {
			throw new LastNameException ("Blank Last Name");
		}
	}
	public void validateAge(int age) throws AgeException{
		if(age < 15) {
			throw new AgeException ("Age should be above 15.");
		}
	}
	
	public Person createPerson(String fName,String lName,int age) {		
		Person p1;
		try {
			validateFirstName(fName);
			validateLastName(lName);
			validateAge(age);
			
			p1 = new Person(fName,lName,age);
			System.out.println(p1);
		}
		
		catch(FirstNameException f) {
			System.out.println(f);
			return null;
		}
		catch(LastNameException l) {
			System.out.println(l);
			return null;
		}
		catch(AgeException a) {
			System.out.println(a);
			return null;
		}
		return p1;
	}
}
