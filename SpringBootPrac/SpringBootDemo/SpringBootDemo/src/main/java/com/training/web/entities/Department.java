package com.training.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_department")
public class Department {
	@Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String deptCode;
    
    //Constructors
	public Department() {}
	
	public Department(String name, String city, String deptCode) {
		super();
		this.name = name;
		this.city = city;
		this.deptCode = deptCode;
	}
	
	public Department(Long id, String name, String city, String deptCode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.deptCode = deptCode;
	}
    
    //get set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", city=" + city + ", deptCode=" + deptCode + "]";
	}

}