package com.training.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Employee implements BeanPostProcessor, BeanNameAware {
	private int id;
	private String name;
	private LocalDate doj;
	private Address address;
	List<String> projects;
	
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	
	public Employee() {}
	
	public Employee(String name, String doj) {
		super();
		this.name = name;
		this.doj = LocalDate.parse(doj);
	}

	public Employee(int id, String name, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.doj = LocalDate.parse(doj);
	}

	public Employee(String name, String doj, Address address) {
		super();
		this.name = name;
		this.doj = LocalDate.parse(doj);
		this.address = address;
	}
	
	public Employee(int id, String name, String doj, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.doj = LocalDate.parse(doj);
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}
	
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public void setDoj(String doj) {
		this.doj = LocalDate.parse(doj);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", address=" + address + "]";
	}	
	
	//method name can be decided by you	
	  public void init() {
		   System.out.println("Employee bean initialised ");
	  }
	  
	  public void destroy() {
		  
		  System.out.println("Employee bean destroyed");
	  }
	  @Override
	  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

	       System.out.println(bean.getClass());
	       System.out.println(beanName);
		  return bean;
		}
	@Override
	public void setBeanName(String name) {
		System.out.println("bean with the name "+name+"has been initialised");
		
	}
		
	
}
