package com.springlab.q3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	int sbuId;
	String sbuHead,sbuName;
	@Autowired
	List<Employee2> empList = new ArrayList<>();
	
	public List<Employee2> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee2> empList) {
		this.empList = empList;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public SBU(int sbuId, String sbuHead, String sbuName, List<Employee2> empList) {
		super();
		this.sbuId = sbuId;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
		this.empList = empList;
	}
	
	public SBU(int sbuId, String sbuHead, String sbuName) {
		super();
		this.sbuId = sbuId;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + ", empList=" + empList + "]";
	}
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
