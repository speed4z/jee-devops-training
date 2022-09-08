package com.lab11.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.lab11.dao.MobilePurchaseDao;
import com.lab11.dao.MobilePurchaseDaoImpl;
import com.lab11.entities.Mobile;
import com.lab11.entities.PurchaseDetails;
import com.lab11.exception.CustomerNameException;
import com.lab11.exception.EmailException;
import com.lab11.exception.EntityNotFoundException;
import com.lab11.exception.MobileIdException;
import com.lab11.exception.PhoneException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilePurchaseServiceImpl implements MobilePurchaseService {
	
	//DAO object
	private MobilePurchaseDao dao = new MobilePurchaseDaoImpl();
	
	//Date format
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//Scanner Object
	Scanner sc = new Scanner(System.in);
	
	//Regex for comparing values	
	Pattern pat_cname = Pattern.compile("^[A-Z]+[[a-zA-Z][ ]]*$");
	Pattern pat_mail = Pattern.compile("[a-zA-Z0-9]+@[a-z]+\\.[a-z]");
	Pattern pat_phone = Pattern.compile("^(\\d{10})$");
	
	public PurchaseDetails createPurchaseDetails() throws PhoneException,EmailException,CustomerNameException, MobileIdException{
		try {			
				System.out.println("Enter customer name:");
				String cname = sc.next();
				Matcher m_cname = pat_cname.matcher(cname);
				if(!m_cname.find()) {				
					throw new CustomerNameException("Customer Name should not be more than 20 characters!");
				}		
				
				System.out.println("Enter mail Id:");
				String mail = sc.next();
				Matcher m_mail = pat_mail.matcher(mail);
				if(!m_mail.find()) {				
					throw new EmailException("Email format is not followed!");
				}
				
				System.out.println("Enter phone number:");
				String phone = sc.next();
				Matcher m_phone = pat_phone.matcher(phone);
				if(!m_phone.find()) {				
					throw new PhoneException("Phone number should be 10 digits!");
				}
				
				LocalDate dateOfPurchase =  LocalDate.now();
				System.out.println("Mobile Id:");
				int mob_id = sc.nextInt();
				Set <Integer> mobileSet = dao.getMobileIdSet();
				if(!mobileSet.contains(mob_id)) {
					throw new MobileIdException("Mobile Id not found in Database!");
				}
				int purchaseid = dao.getLastPurchaseId();
				
				PurchaseDetails pd1 = new PurchaseDetails(purchaseid,cname,mail,phone,dateOfPurchase,mob_id);
				return pd1;
		}
		catch(CustomerNameException cn) {
			System.out.println(cn);
		}
		catch(EmailException ee) {
			System.out.println(ee);
		}
		catch(PhoneException p) {
			System.out.println(p);
		}
		catch(MobileIdException mi) {
			System.out.println(mi);
		}
		return null;		
	}
	

	@Override
	public PurchaseDetails insertPurchaseDetails(PurchaseDetails obj) {
		
		return dao.insertPurchaseDetails(obj);
	}

	@Override
	public Mobile updateMobileQuantity(int id) {
		
		return dao.updateMobileQuantity(id);
	}

	@Override
	public List<Mobile> listAllMobiles() {
		// TODO Auto-generated method stub
		return dao.listAllMobiles();
	}

	@Override
	public Mobile listMobileById(int a) {
		// TODO Auto-generated method stub
		try {
			return dao.listMobileById(a);
		} 
		catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List listByPriceRange(double a, double b) {
		// TODO Auto-generated method stub
		try {
			return  dao.listByPriceRange(a,b);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
