package com.training.app;

import java.time.LocalDate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.training.entities.Employee;
import com.training.entities.Printable;
import com.training.entities.Product;
import com.training.entities.Student;

public class App {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e = factory.getBean("emp1",Employee.class);
		System.out.println(e);
		System.out.println(e.hashCode());
		e.setName("hiten");
		System.out.println(e);

	
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e2=context.getBean("emp1",Employee.class);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		System.out.println("compare the references "+(e==e2));
		
		Student st =  context.getBean("student1",Student.class);
		System.out.println(st.getName());
		System.out.println(st.getCourses());
		
		Employee e3=context.getBean("emp2",Employee.class);
		e3.setName("alok");
		e3.setDoj(LocalDate.of(2022, 1, 1));
		System.out.println(e3);
		System.out.println(e3.getProjects());
		
		Student st2 =  context.getBean("st2",Student.class);
		st2.setCourses(st.getCourses());
		System.out.println(st2);
		
		
		Product p1 =  context.getBean("prod1",Product.class);
		System.out.println(p1);
		Product p3=  context.getBean("prod1",Product.class);
		System.out.println(p3);
		
         System.out.println("singleton"+(p1==p3));
		Product p2=  context.getBean("prod2",Product.class);
		System.out.println(p2);
		
		Printable printable= (Printable) context.getBean("printable");
		printable.print();		
		((ClassPathXmlApplicationContext)context).registerShutdownHook();
	}

}