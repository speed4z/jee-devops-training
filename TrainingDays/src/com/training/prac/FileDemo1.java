package com.training.prac;

public class FileDemo1 {
	public static void main(String[] args) {
		
		StringBuffer sb =  new StringBuffer();
		
		char c;
		System.out.println("Enter a string");
		try {
			
			while((c=(char)System.in.read()) != '\n') {
				
				sb.append(c);
			}
		}
		catch(Exception e) {
			System.out.println("some exception"+e.getMessage());
			
		}
		
		String s = new String(sb);
		System.out.println("You entered: " +s);
	}
	
	}