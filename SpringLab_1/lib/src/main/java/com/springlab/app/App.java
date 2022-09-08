package com.springlab.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springlab.q1.Employee;
import com.springlab.q2.Employee2;
import com.springlab.q2.SBU;



public class App {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		
//		BeanFactory factory= new XmlBeanFactory(resource);		
//		Employee e1 = factory.getBean("emp1",Employee.class);
//		System.out.println(e1);
//		System.out.println("====================");
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");		
		Employee e1 = context.getBean("emp1",Employee.class);		
		System.out.println(e1);		
		System.out.println("================================");
		
		
		//SBU sbu1 = context.getBean("sbu1",SBU.class);
		Employee2 e2 = context.getBean("emp2",Employee2.class);	
		System.out.println(e2);
		System.out.println(e2.getSbuDetails());
		
	}
}
