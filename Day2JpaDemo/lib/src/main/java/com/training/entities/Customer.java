package com.training.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Custo")
public class Customer {
	@Id
	@GeneratedValue
	private long custId;	
	private String cName;
	
	//Constructors
	
	public Customer() {}

	public Customer(String cName) {
		super();
		this.cName = cName;
	}
	
	public Customer(long custId, String cName) {
		super();
		this.custId = custId;
		this.cName = cName;
	}
	
	//Get set
	
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cName=" + cName + "]";
	}	
}
