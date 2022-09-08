package com.lab11.entities;

//import java.sql.Date;
import java.time.LocalDate;


public class PurchaseDetails {
	private  int purchaseid ;
	private String cname ;
	private String mailid ;
	private String phoneno ;
	private LocalDate purchasedate;
	private int mobileid ;
	
	
	public int getPurchaseid() {
		return purchaseid;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	
	//Constructors
	
	public PurchaseDetails() {
	}
	
	public PurchaseDetails(int id,String cname, String mailid, String phoneno) {
		super();
		this.purchaseid =id;
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
	}
	
	public PurchaseDetails(int id,String cname, String mailid, String phoneno, LocalDate purchasedate) {
		super();
		this.purchaseid = id;
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
		this.purchasedate = purchasedate;
	}
	
	public PurchaseDetails(int id,String cname, String mailid, String phoneno,LocalDate purchasedate,
			int mobileid) {
		super();
		this.purchaseid = id;
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
		this.purchasedate = purchasedate;
		this.mobileid = mobileid;
	}
}
