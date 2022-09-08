package com.springlab.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans0.xml");
		((ClassPathXmlApplicationContext)context).registerShutdownHook();
		Employee e=context.getBean("emp2",Employee.class);
		System.out.println(e);
		Employee e1=context.getBean("emp2",Employee.class);
		System.out.println(e1);
		
		Employee2 e21 = new Employee2(1,"we",123.0);
		
		SBU s1 = context.getBean("sbu1",SBU.class);
		System.out.println(s1);
	}
	
}
