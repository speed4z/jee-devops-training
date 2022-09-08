package com.lab3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class ZoneTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Zone Id");
		String zone = sc.next();
		System.out.println(ZonedDateTime.now(ZoneId.of(zone)));			
		sc.close();	
	}
}
